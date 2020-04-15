package net.clientv1.modules;

import net.clientv1.event.EventTarget;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.server.management.PlayerInteractionManager;
import org.lwjgl.input.Keyboard;

@module.ModInfo(name = "reachHack", description = "Allows players to hit others from further away.", type = module.type.COMBAT, keyCode = Keyboard.KEY_R)

public class reachHack extends module {
    public void onInitialized() {
        PlayerControllerMP.setExtendedReach(true);
    }
    public void onUninitialized() {
        PlayerControllerMP.setExtendedReach(false);
    }
}
