package net.clientv1.events;

import net.clientv1.event.Event;

public class Render3DEvent extends Event {
    public float particleTicks;

    public Render3DEvent(float particleTicks) {
        this.particleTicks = particleTicks;
    }

    public float getParticleTicks() {
        return particleTicks;
    }

    public void setParticleTicks(float particleTicks) {
        this.particleTicks = particleTicks;
    }
}
