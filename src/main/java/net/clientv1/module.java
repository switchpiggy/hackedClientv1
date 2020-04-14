package net.clientv1;

import net.clientv1.event.EventManager;
import org.lwjgl.input.Keyboard;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class module {
    private String name = getClass().getAnnotation(ModInfo.class).name();
    private String description = getClass().getAnnotation(ModInfo.class).description();
    private boolean initialized;
    private int keyCode = getClass().getAnnotation(ModInfo.class).keyCode();
    private type type = getClass().getAnnotation(ModInfo.class).type();

    public void onInitialized() {

    }

    public void onUninitialized() {

    }

    public void onUpdate() {

    }

    public void toggle() {
        setInitialized(!this.isInitialized());
    }

    public enum type {
        COMBAT(0),
        MOVEMENT(0),
        RENDER(0),
        WORLD(0),
        MISC(0),
        PLAYER(0),
        GUI(0);

        public int color;

        type(int color) {
            this.color = color;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ModInfo {
        String name();
        String description();
        type type();
        int keyCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        onUpdate();
        if(initialized) {
            this.initialized = true;
            onInitialized();
            EventManager.register(this);
        } else {
            onUninitialized();
            this.initialized = false;
            EventManager.unregister(this);
        }
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public module.type getType() {
        return type;
    }

    public void setType(module.type type) {
        this.type = type;
    }

    public final boolean isType(type type) {
        if(type == this.getType()) {
            return true;
        } else {
            return false;
        }
    }

    public String getKeyName() {
        return getKeyCode() == -1 ? "-1" : Keyboard.getKeyName(getKeyCode());
    }
}
