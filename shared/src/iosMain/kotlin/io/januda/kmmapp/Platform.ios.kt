package io.januda.kmmapp

import platform.UIKit.UIDevice

// This is the implementation of the Platform interface is specific to iOS
class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}
// This function is used to get the platform-specific implementation of the Platform interface
actual fun getPlatform(): Platform = IOSPlatform()