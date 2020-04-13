package net.clientv1.events;

import net.clientv1.event.Event;

public class keyboardEvent extends Event {
    public int key;
    public int getKey() {
        return key;
    }
    public keyboardEvent(int key) {
        this.key = key;
    }
}
