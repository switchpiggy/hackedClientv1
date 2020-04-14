package net.clientv1.events;

import net.clientv1.event.Event;

public class preMotionUpdateEvent  extends Event {
    private boolean cancel;
    public float yaw, pitch;
    public double y;

    public preMotionUpdateEvent(float yaw, float pitch, double y) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.y = y;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }
}
