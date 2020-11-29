package ru.assistant.auth.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import ru.assistant.core.AppConstants.FRAGMENT_SIGN_IN
import ru.assistant.core.entity.AuthData
import ru.assistant.core.entity.User

open class AuthViewModel : AuthUI() {

    private val state = MutableLiveData<Byte>()
    private val lastState = MutableLiveData<Byte>()

//    private val interactor = AuthInteractor.getInstance()

    private val tryAuthData = MutableLiveData<Boolean>() // Попытка авторизации
    private val userData = MutableLiveData<User>()       // Сам пользователь

    // Coroutine
    // private val viewModelJob = SupervisorJob()
    // private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    //SignUp
    private val userAuth = AuthData()                    // данные для регистрации

    init {
        state.value = FRAGMENT_SIGN_IN
    }

    // Авторизация
    override fun signIn() {
        super.signIn()

        tryAuthData.value = true // Флаг, попытка авторизации

      /*  // Coroutine
        uiScope.launch {
            val result = interactor.signIn(getEmail(), getPass())
            setActionName(interactor.signIn(getEmail(), getPass()).toString())
        }*/
    }

    fun isAuth(): Boolean = false


    fun setLastState(state: Byte) {
        lastState.postValue(state)
    }

    fun getLastState() = lastState.value

    fun setState(state: Byte) {
        this.state.value = state
    }

    fun getState() = state.value

    fun observeState(owner: LifecycleOwner, observer: Observer<Byte>) {
        state.observe(owner, observer)
    }


    override fun restore() {
   //     uiScope.launch {
         //   interactor.restore(getEmail())
     //   }
    }

    override fun onCleared() {
        super.onCleared()
    //    viewModelJob.cancel()
    }

}