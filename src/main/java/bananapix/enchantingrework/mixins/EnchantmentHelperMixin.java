package bananapix.enchantingrework.mixins;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import bananapix.enchantingrework.common.enchantment.ModEnchantmentInstance;
import bananapix.enchantingrework.common.enchantment.ModEnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Overwrite
    public static List<ModEnchantmentInstance> getAvailableEnchantmentResults(ItemStack stack, boolean allowTreasure) {
        return ModEnchantmentHelper.getAvailableEnchantmentResults(stack, allowTreasure);
    }
}
