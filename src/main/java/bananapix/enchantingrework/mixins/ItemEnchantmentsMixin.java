package bananapix.enchantingrework.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.core.Holder;
import net.minecraft.world.item.enchantment.Enchantment;

//@Mixin(ItemEnchantments.class)
//public interface IItemEnchantmentsMixin {
    //@Accessor
    //ItemEnchantments getFullCodec;

//    @Shadow
//    @Final
//    private ItemEnchantments FULL_CODEC;

//    @Shadow
//    @Final
//    public static Codec<ItemEnchantments> CODEC = Codec.withAlternative(FULL_CODEC, LEVELS_CODEC, converter -> new ItemEnchantments(converter, true));
//}
