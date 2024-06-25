package bananapix.enchantingrework.common.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;

public class ModEnchantmentInstance extends EnchantmentInstance {
    public int attuneLevel;
    public int attuneExperience;

    public ModEnchantmentInstance(Enchantment enchantment, int level, int attuneLevel, int attuneExperience) {
        super(enchantment, level);
        this.attuneLevel = attuneLevel;
        this.attuneExperience = attuneExperience;
    }
}
