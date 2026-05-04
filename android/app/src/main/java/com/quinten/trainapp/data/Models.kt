package com.quinten.trainapp.data

enum class DayType { WORKOUT, RUN, REST, NUTRITION, POSTURE }

data class Guide(
    val how: String,
    val tips: List<String>
)

data class Exercise(
    val name: String,
    val sets: Int,
    val reps: String,
    val rest: Int,
    val knee: Boolean = false,
    val guide: Guide
)

data class Day(
    val key: String,
    val label: String,
    val sub: String,
    val type: DayType,
    val exercises: List<Exercise> = emptyList()
)

data class Phase(
    val label: String,
    val weeks: String
)
