package org.entityevolution.nukacraft.item

import net.minecraft.item.ArmorItem

import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

enum class NukaArmorMaterials(
  private val armorName: String,
  private val enchantability: Int,
  private val equipSound: SoundEvent,
  private val toughness: Float,
  private val knockbackResistance: Float,
  private val repairIngredient: () -> Ingredient?
) : ArmorMaterial {
  T51(
    "t51", 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f,
    2.0f, { Ingredient.ofItems(net.minecraft.item.Items.IRON_INGOT) }
  ) {
    override fun getProtection(type: ArmorItem.Type?): Int {
      TODO("Not yet implemented")
    }

    override fun getDurability(type: ArmorItem.Type?): Int {
      TODO("Not yet implemented")
    }
  };
  override fun getName(): String = armorName
  override fun getEquipSound (): SoundEvent = equipSound
  override fun getRepairIngredient (): Ingredient? = repairIngredient()
  override fun getEnchantability(): Int = enchantability
  override fun getKnockbackResistance(): Float = knockbackResistance
  override fun getToughness(): Float = toughness
  companion object {
    private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
  }
}

