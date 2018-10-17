package ru.vyaacheslav.suhov.imeit.core

/** В данном классе описываются поля данных для формирования списка BellsList
 * @author SukhovViacheslav
 * @version 1.0
 *
 * @param id  - Порядковый номер
 * @param countPairs - Колличество пар
 * @param startPairs - Начало занятий
 * @param lengthLesson - Продолжительность урока
 * @param lengthBreak - Продолжительность перемены
 * @param lengthLunch - Продолжительность большой перемены
 * @param lengthBreakPair -Продолжительность перемены между парами
 * @param lunchStart - Большая перемена после <номер пары>
 * @param date - Дата изменеия по дефолту 0
 * @param isChanged - Поле изменяемое*/

data class PreferencesBells(

        val id: Int = 0,
        val countPairs: Int = 6,
        val startPairs: Int = 510,
        val lengthLesson: Int = 45,
        val lengthBreak: Int = 5,
        val lengthLunch: Int = 40,
        val lengthBreakPair: Int = 10,
        val lunchStart: Int = 2,
        val date: Int = 0,
        val isChanged: Boolean = true)