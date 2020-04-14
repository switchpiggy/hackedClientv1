package net.clientv1.modules;

import net.clientv1.event.EventTarget;
import net.clientv1.events.eventUpdate;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.play.client.CPacketEntityAction;
import org.lwjgl.input.Keyboard;

@module.ModInfo(name = "sneakHack", description = "Automatically crouches.", type = module.type.MOVEMENT, keyCode = Keyboard.KEY_Y)

public class sneakHack extends module {

    KeyBinding sneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

    @EventTarget
    public void onUpdate(eventUpdate event) {
        if(isInitialized()) {
            KeyBinding.setKeyBindState(sneak.getKeyCode(), true);
        }
    }

    @Override
    public void onUninitialized() {
        KeyBinding.setKeyBindState(sneak.getKeyCode(), sneak.isPressed());
    }
}
