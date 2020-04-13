package net.clientv1;

import net.clientv1.modules.FlyHack;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;

public class client {

    public static String name = "client", version = "v1";
    public static CopyOnWriteArrayList<module> modules = new CopyOnWriteArrayList<module>();

    public static void initializeClient() {
        System.out.println("Starting" + name + " " + version);
        Display.setTitle(name + " " + version);
        modules.add(new FlyHack());
    }

    public static void pressedKey(int key) {
        for(module m : modules) {
            if(m.getKey() == key) {
                m.initialize();
            }
        }
    }
}
