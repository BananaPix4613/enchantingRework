package bananapix.enchantingrework.common.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantmentInfo {
    protected final Enchantment enchantment;
    protected final int maxLevel, maxLootLevel;
    protected final boolean treasure, discoverable, lootable, tradeable;

    public ModEnchantmentInfo(Enchantment enchantment, int maxLevel, int maxLootLevel, boolean treasure, boolean discoverable, boolean lootable, boolean tradeable) {
        this.enchantment = enchantment;
        this.maxLevel = maxLevel;
        this.maxLootLevel = maxLootLevel;
        this.treasure = treasure;
        this.discoverable = discoverable;
        this.lootable = lootable;
        this.tradeable = tradeable;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public int getMaxLootLevel() {
        return this.maxLootLevel;
    }

    public boolean isTreasure() {
        return this.treasure;
    }

    public boolean isDiscoverable() {
        return this.discoverable;
    }

    public boolean isLootable() {
        return this.lootable;
    }

    public boolean isTradeable() {
        return this.tradeable;
    }
}
