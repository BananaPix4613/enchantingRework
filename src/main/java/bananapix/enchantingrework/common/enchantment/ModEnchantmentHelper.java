package bananapix.enchantingrework.common.enchantment;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.WeightedRandom;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class ModEnchantmentHelper {
    public static List<ModEnchantmentInstance> selectEnchantment(ItemStack stack, boolean treasure) {
        List<ModEnchantmentInstance> list = Lists.newArrayList();
        int power = 25;
        int enchantability = stack.getEnchantmentValue();
        if (enchantability > 0) {
            list = getAvailableEnchantmentResults(stack, treasure);
        }
        return list;
    }

    public static void filterCompatibleEnchantments(List<ModEnchantmentInstance> list, ModEnchantmentInstance inst) {
        Iterator<ModEnchantmentInstance> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (!inst.enchantment.isCompatibleWith(iterator.next().enchantment)) {
                iterator.remove();
            }
        }
    }

    public static List<ModEnchantmentInstance> getAvailableEnchantmentResults(ItemStack stack, boolean allowTreasure) {
        List<ModEnchantmentInstance> list = Lists.newArrayList();
        boolean flag = stack.is(Items.BOOK);

        for (Enchantment enchantment : ForgeRegistries.ENCHANTMENTS) {
            if ((!enchantment.isTreasureOnly() || allowTreasure)
                    && enchantment.isDiscoverable()
                    && !flag
                    && enchantment.canApplyAtEnchantingTable(stack)) {
                list.add(new ModEnchantmentInstance(enchantment, 1, 0, 0));
            }
        }
        return list;
    }
}
