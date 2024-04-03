package io.januda.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform