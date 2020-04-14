package net.clientv1.modules;
import net.clientv1.event.EventTarget;
import net.clientv1.events.eventUpdate;
import net.clientv1.module;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;

@module.ModInfo(name = "flyHack", description = "Allows users to fly", type = module.type.MOVEMENT, keyCode = Keyboard.KEY_F)

public class FlyHack extends module {

}
