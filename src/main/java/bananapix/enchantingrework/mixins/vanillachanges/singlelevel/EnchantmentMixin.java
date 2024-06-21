package bananapix.enchantingrework.mixins.vanillachanges.singlelevel;

import bananapix.enchantingrework.common.util.EnchantingReworkUtil;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @ModifyReturnValue(method = "getMaxLevel", at = @At("RETURN"))
    private int enchantingrework$singleLevel(int original) {
        if (!EnchantingReworkUtil.MAX_LEVELS.containsKey((Enchantment) (Object) this)) {
            EnchantingReworkUtil.MAX_LEVELS.put((Enchantment) (Object) this, original);
        }
        return 1;
    }
}
