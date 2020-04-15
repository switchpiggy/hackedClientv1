package net.clientv1;

import net.clientv1.modules.*;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.TreeMap;

public class moduleManager {

    private final TreeMap<String, module> modules = new TreeMap<>();

    public final step step = new step();
    public final noFallHack noFallHack = new noFallHack();
    public final autoHealHack autoHealHack = new autoHealHack();
    public final sneakHack sneakHack = new sneakHack();
    public final fullBrightHack fullBrightHack = new fullBrightHack();
    public final reachHack reachHack = new reachHack();

    public moduleManager() {
        try {
            for(Field field : moduleManager.class.getFields()) {
                module module = (module) field.get(this);
                modules.put(module.getName(), module);
                System.out.println(module.getName());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Collection<module> getAllModules() {
        return modules.values();
    }

    public module getModuleByName(String name) {
        return modules.get(name);
    }

    public module getModuleByClass(Class<? extends module> cls) {
        for(module module : getAllModules()) {
            if(module.getClass() == cls) {
                return module;
            }
        }

        return null;
    }
}
