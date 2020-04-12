package net.clientv1.events;

import java.util.EventListener;

public abstract class event<T> {

    public boolean cancelled;
    public eventType type;
    public eventDir dir;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled() {
        cancelled = !cancelled;
    }

    public eventType getType() {
        return type;
    }

    public void setType(eventType t) {
        this.type = t;
    }

    public eventDir getDir() {
        return dir;
    }

    public void setDir(eventDir d) {
        this.dir = d;
    }

    public boolean isPre() {
        if(type == null) return false;
        return type == eventType.PRE;
    }

    public boolean isPost() {
        if(type == null) return false;
        return type == eventType.POST;
    }

    public boolean isIncoming() {
        if(dir == null) return false;
        return dir == eventDir.INCOMING;
    }

    public boolean isOutgoing() {
        if(dir == null) return false;
        return dir == eventDir.OUTGOING;
    }

}
