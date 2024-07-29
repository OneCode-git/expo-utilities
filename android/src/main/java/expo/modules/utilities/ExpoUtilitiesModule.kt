package expo.modules.utilities

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoUtilitiesModule : Module() {
    private var splashStartTime: Double = 0.0

    override fun definition() = ModuleDefinition {
        Name("ExpoUtilities")

        AsyncFunction("getSplashStartTime") {
            splashStartTime
        }

        OnCreate {
            setSplashStartTime()
        }
    }

    private fun setSplashStartTime() {
        splashStartTime = System.currentTimeMillis().toDouble()
    }
}