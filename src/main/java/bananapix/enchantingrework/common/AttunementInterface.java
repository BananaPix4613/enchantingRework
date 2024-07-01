package bananapix.enchantingrework.common;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;

public interface AttunementInterface extends INBTSerializable<CompoundTag> {
    String getValue();

    void setMyValue(String myValue);
}
