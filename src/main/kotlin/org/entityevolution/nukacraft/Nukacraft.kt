package org.entityevolution.nukacraft

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import org.entityevolution.nukacraft.item.NukaItem
import org.slf4j.LoggerFactory


object Nukacraft : ModInitializer {
  val logger = LoggerFactory.getLogger("Nukacraft")
  const val MOD_ID = "nukacraft"
  val NukaCola: NukaItem = NukaItem(FabricItemSettings().maxCount(5))

  override fun onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.
    logger.info("Hello Fabric world!")
  }
}
