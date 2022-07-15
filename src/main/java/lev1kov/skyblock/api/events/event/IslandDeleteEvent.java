package lev1kov.skyblock.api.events.event;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lev1kov.skyblock.api.events.IslandEvent;

public class IslandDeleteEvent extends IslandEvent {

    private final Gamer gamer;
    private final Island island;

    public IslandDeleteEvent(Gamer var1, Island var2) {
        this.gamer = var1;
        this.island = var2;

        super.call();
    }

    public Island getIsland() {
        return island;
    }

    public Gamer getGamer() {
        return gamer;
    }

}
