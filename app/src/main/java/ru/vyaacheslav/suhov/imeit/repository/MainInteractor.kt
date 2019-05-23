package ru.vyaacheslav.suhov.imeit.repository

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import io.reactivex.Observable
import ru.vyaacheslav.suhov.imeit.repository.entity.MapData
import ru.vyaacheslav.suhov.imeit.repository.entity.Schedule
import ru.vyaacheslav.suhov.imeit.repository.entity.CallPref
import ru.vyaacheslav.suhov.imeit.util.Constants.CUSTOM

class MainInteractor(val repository: FirebaseRealtimeRepository) {

    private val localRepository = LocalRepository().getInstance()
    private val institute = localRepository.institute
    private val faculty = localRepository.faculty
    private val group = localRepository.group

    /** @return - Список всех корпусов */
    fun getListBuildings(): Observable<ArrayList<MapData>> {
        return Observable.create {
            repository.getRefListEducationBuildings()

                    .addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {

                            val list = arrayListOf<MapData>()
                            // Все существующие элементы узла
                            for (x: DataSnapshot in snapshot.children) {
                                list.add(x.getValue(MapData::class.java) ?: MapData())
                            }
                            it.onNext(list)
                        }

                        override fun onCancelled(snapshot: DatabaseError) {}
                    })
        }
    }

    /** @return - Список всех групп */
    fun getListGroups(institute: String, faculty: String): Observable<ArrayList<String>> {
        return Observable.create {
            repository.getRefListGroups(institute, faculty)
                    .addValueEventListener(object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {

                            val list = arrayListOf("Группа не выбрана")
                            for (s: DataSnapshot in snapshot.children) {
                                list.add(s.key.toString()) // Список по ключам!
                            }
                            it.onNext(list)
                        }

                        override fun onCancelled(snapshot: DatabaseError) {}
                    })
        }
    }

    /** @return - Список в парами к текущему дню */
    // Слишком ного параметров | Переделать
    fun getScheduleDay(day: String): Observable<ArrayList<Schedule>> {
        return Observable.create {
            repository.getRefListSchedule(institute, faculty, group, day)
                    .addValueEventListener(object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {

                            val list = ArrayList<Schedule>()
                            for (x in 1..localRepository.countPair) {
                                list.add(snapshot.child("pair$x").getValue(Schedule::class.java)
                                        ?: Schedule()) // <- косяк ("pair$x"); просто по пройтись по дочерним нельзя,
                                // т.к. может быть пустая пара и пужно получить индекс пустой
                                // можно кончено просто менять последний char; получается почти тоже самое.
                            }
                            it.onNext(list)
                        }
                        override fun onCancelled(snapshot: DatabaseError) {}
                    })
        }
    }


    /**@param type - Тип установок DEFAULT или CUSTOM (Пользовательские)
     * @return - Установки  звонков*/
    fun getCallPref(type:String): Observable<CallPref> {
        return Observable.create {
            repository.getRefPreferencesCall(type)
                    .addValueEventListener(object : ValueEventListener {

                        override fun onDataChange(p0: DataSnapshot) {
                            it.onNext(p0.getValue(CallPref::class.java) ?: CallPref())
                        }

                        override fun onCancelled(p0: DatabaseError) {
                            it.onError(Throwable(p0.toString()))
                        }
                    })
        }
    }

    /**  Просто отправляем новые установки для звонков
     * @param pref - Установки для передачи */
    fun setCustomCallPref(pref: CallPref) {
        repository.getRefPreferencesCall(CUSTOM).setValue(pref)
    }
}