package org.entityevolution

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Nukacraft : ModInitializer {
  private val logger = LoggerFactory.getLogger("nukacraft")

  override fun onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.
    logger.info("Hello Fabric world!")
  }
}
