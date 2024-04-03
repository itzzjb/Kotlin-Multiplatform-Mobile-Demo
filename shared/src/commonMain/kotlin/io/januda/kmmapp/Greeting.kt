package io.januda.kmmapp

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class Greeting {
    private val platform: Platform = getPlatform()

    // This function returns the platform name of the device
    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    // This function returns the name of the developer
    fun name(): String {
        return "My name is Januda"
    }

    // This function returns the current date
    fun todaysDate(): String {
        fun LocalDateTime.format() = toString().substringBefore('T')

        val now = Clock.System.now()
        val zone = TimeZone.currentSystemDefault()
        return now.toLocalDateTime(zone).format()
    }

}