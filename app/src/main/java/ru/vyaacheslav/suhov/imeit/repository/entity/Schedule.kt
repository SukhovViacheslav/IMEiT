package ru.vyaacheslav.suhov.imeit.repository.entity

data class Schedule(
        val together: Int = 0,
        val name: String = "",
        val surname: String = "",
        val type: String = "",
        val build: String = "",
        val name_out: String = "",
        val surname_out: String = "",
        val type_out: String = "",
        val build_out: String = "",
        val note: String = ""
)