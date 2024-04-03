package io.januda.kmmapp

// This is an interface that will be implemented in the platform-specific modules
interface Platform {
    val name: String
}

// This function will be implemented in the platform-specific modules
expect fun getPlatform(): Platform