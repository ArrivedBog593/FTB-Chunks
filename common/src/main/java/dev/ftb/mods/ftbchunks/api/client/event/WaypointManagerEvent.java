package dev.ftb.mods.ftbchunks.api.client.event;

import dev.architectury.event.Event;
import dev.architectury.event.EventFactory;
import dev.ftb.mods.ftbchunks.api.client.waypoint.WaypointManager;

public interface WaypointManagerEvent {
    /**
     * @see #onAvailable(WaypointManager)
     */
    Event<WaypointManagerEvent> AVAILABLE = EventFactory.createLoop();

    /**
     * Fired when the {@link WaypointManager} becomes available, immediately after the client player enters a new
     * dimension, including initial login.
     */
    void onAvailable(WaypointManager manager);
}
