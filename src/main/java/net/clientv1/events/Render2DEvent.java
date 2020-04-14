package net.clientv1.events;

import net.clientv1.event.Event;

public class Render2DEvent extends Event {
    public int width, height;

    public Render2DEvent(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
