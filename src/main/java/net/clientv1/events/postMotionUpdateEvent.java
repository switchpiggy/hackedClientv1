package net.clientv1.events;

import net.clientv1.event.Event;

public class postMotionUpdateEvent extends Event {
    public float yaw, pitch;
    public boolean ground;
    public double y;

    public postMotionUpdateEvent(float yaw, float pitch, boolean ground, double y) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.ground = ground;
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

    public boolean isGround() {
        return ground;
    }

    public void setGround(boolean ground) {
        this.ground = ground;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
