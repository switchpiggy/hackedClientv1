package net.clientv1.events;

import net.clientv1.event.Event;

public class preMotionUpdateEvent  extends Event {
    private boolean cancel;
    public float yaw, pitch;
    public double y;
}
