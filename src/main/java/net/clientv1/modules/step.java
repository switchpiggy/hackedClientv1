package net.clientv1.modules;

import net.clientv1.event.EventTarget;
import net.clientv1.events.eventUpdate;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

@module.ModInfo(name = "step", description = "Walk up blocks", type = module.type.MOVEMENT, keyCode = Keyboard.KEY_V)

public class step extends module {

    @EventTarget
    public void onUpdate(eventUpdate event) {
        if(isInitialized()) {
            Minecraft.getMinecraft().player.stepHeight = 1;
        }
    }

    @Override
    public void onUninitialized() {
        Minecraft.getMinecraft().player.stepHeight = 0.5F;
    }
}
