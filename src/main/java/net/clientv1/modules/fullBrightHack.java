package net.clientv1.modules;

import net.clientv1.events.eventUpdate;
import net.clientv1.module;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import org.lwjgl.input.Keyboard;

import java.util.Objects;

@module.ModInfo(name = "fullBrightHack", description = "Sets brightness to max. Very bright.", type = module.type.RENDER, keyCode = Keyboard.KEY_U)

public class fullBrightHack extends module {

    private boolean hasNightVision;

    @Override
    public void onUpdate() {
        if(isInitialized()) {
            applyNightVision();
        } else {
            removeNightVision();
        }
    }

    private void applyNightVision() {
        if(hasNightVision) return;
        Minecraft.getMinecraft().player.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(16)), 1000000000, 1, false, false));
        hasNightVision = true;
    }

    private void removeNightVision() {
        if(!hasNightVision) return;
        Minecraft.getMinecraft().player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(16)));
        hasNightVision = false;
    }

    @Override
    public void onUninitialized() {
        removeNightVision();
    }
}
