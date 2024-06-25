package bananapix.enchantingrework.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import bananapix.enchantingrework.common.enchantment.ModEnchantmentInstance;
import net.minecraft.world.item.enchantment.EnchantmentInstance;

@Mixin(EnchantmentInstance.class)
public class EnchantmentInstanceMixin {
    @Overwrite
    public EnchantmentInstance() {}
}
