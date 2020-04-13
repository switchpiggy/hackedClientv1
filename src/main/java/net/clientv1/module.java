package net.clientv1;

public class module {
    public String name;
    public boolean initialized;
    public int keyCode;
    public static type type;

    public module(String name, int key, type t) {
        this.name = name;
        this.keyCode = key;
        type = t;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public int getKey() {
        return keyCode;
    }

    public void initialize() {
        initialized = !initialized;
        if(initialized) {
            onInitialized();
        } else {
            onUninitialized();
        }
    }

    public void onInitialized() {

    }

    public void onUninitialized() {

    }

    public void onUpdate() {

    }

    public enum type {
        COMBAT,
        MOVEMENT,
        RENDER,
        PLAYER
    }
}
