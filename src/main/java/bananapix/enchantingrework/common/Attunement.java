package bananapix.enchantingrework.common;

import net.minecraftforge.common.capabilities.*;

public class Attunement {
    public static final Capability<AttunementInterface> INSTANCE = CapabilityManager.get(new CapabilityToken<>() {});

    public static void register(RegisterCapabilitiesEvent event) {
        event.register(AttunementInterface.class);
    }

    private Attunement() {
    }
}
