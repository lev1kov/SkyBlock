package lev1kov.skyblock.api.events;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public abstract class IslandEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public void call() {
        Bukkit.getPluginManager().callEvent(this);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
