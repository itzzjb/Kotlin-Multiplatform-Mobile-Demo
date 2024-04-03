package io.januda.kmmapp

// This is the implementation of the Platform interface is specific to Android
class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

// This function is used to get the platform-specific implementation of the Platform interface
actual fun getPlatform(): Platform = AndroidPlatform()