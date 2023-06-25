package org.entityevolution

import net.fabricmc.api.ClientModInitializer

object ExampleModClient : ClientModInitializer {
	override fun onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		// Log hello world to the console
		println("Hello Fabric world! (client)")
	}
}