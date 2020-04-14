package net.clientv1.modules;

import net.clientv1.client;
import net.clientv1.event.EventTarget;
import net.clientv1.events.eventUpdate;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

import java.sql.Connection;

@module.ModInfo(name = "noFall", description = "No fall damage.", type = module.type.MOVEMENT, keyCode = Keyboard.KEY_N)

public class noFallHack extends module {
    @EventTarget
    public void onUpdate(eventUpdate event) {
        if(isInitialized() && Minecraft.getMinecraft().player.fallDistance > 2) Minecraft.getMinecraft().getConnection().sendPacket(new CPacketPlayer(true));
    }
}
