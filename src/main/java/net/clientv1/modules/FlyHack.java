package net.clientv1.modules;
import net.clientv1.module;
import org.lwjgl.input.Keyboard;

public class FlyHack extends module {

    public FlyHack() {
        super("FlyHack", Keyboard.KEY_G, type.MOVEMENT);
    }
}
