package net.clientv1.gui;

import net.clientv1.client;
import net.clientv1.event.EventManager;
import net.clientv1.event.EventTarget;
import net.clientv1.events.Render2DEvent;

public class Hud {
    public Hud() {
        EventManager.register(this);
    }

    @EventTarget
    public void onRender(Render2DEvent event) {
        client.INSTANCE.FONT_MANAGER.hud.drawString(client.name + " Rel-" + client.version, 2, 2, -1);

    }
}
