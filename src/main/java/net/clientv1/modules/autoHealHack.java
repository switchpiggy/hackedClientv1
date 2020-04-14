package net.clientv1.modules;

import net.clientv1.event.EventTarget;
import net.clientv1.events.eventUpdate;
import net.clientv1.events.tickEvent;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

@module.ModInfo(name = "autoHeal", description = "Auto heal to full health!", type = module.type.COMBAT, keyCode = Keyboard.KEY_H)

public class autoHealHack extends module {

    @EventTarget
    public void onUpdate(eventUpdate event) {
        if(isInitialized() && Minecraft.getMinecraft().player.getHealth() < 20) {

        }
    }

    @Override
    public void onUninitialized() {

    }
}
