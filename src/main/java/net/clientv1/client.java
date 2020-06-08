package net.clientv1;

import net.clientv1.event.EventManager;
import net.clientv1.event.EventTarget;
import net.clientv1.events.keyboardEvent;
import net.clientv1.fonts.FontManager;
import net.clientv1.gui.Hud;
import net.clientv1.modules.FlyHack;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;

public class client {

    public static String name = "client", version = "v1";

    public static final client INSTANCE = new client();

    public final moduleManager MODULE_MANAGER = new moduleManager();

    public final FontManager FONT_MANAGER = new FontManager();

    public final Hud HUD = new Hud();

    public void initializeClient() {
        System.out.println("Starting" + name + " " + version);
        Display.setTitle(name + " " + version);
        EventManager.register(this);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> endClient()));
    }

    public void endClient() {

    }

    @EventTarget
    private void keyboardEvent(keyboardEvent keyboardEvent) {
        for(module module : client.INSTANCE.MODULE_MANAGER.getAllModules()) {
            if(Keyboard.getEventKey() == module.getKeyCode()) {
                module.toggle();
            }
        }
    }

}
