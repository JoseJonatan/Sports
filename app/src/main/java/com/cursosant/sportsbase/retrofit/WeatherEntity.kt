package com.cursosant.sportsbase.retrofit

data class WeatherEntity(val base: String,
                         val main: Main,
                         val sys: Sys,
                         val id: Int,
                         val name: String)
