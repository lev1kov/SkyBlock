package lev1kov.skyblock.api.events.event;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lev1kov.skyblock.api.events.IslandEvent;

public class IslandMemberRemoveEvent extends IslandEvent {

    private final Gamer owner;
    private final Gamer member;
    private final Island island;

    public IslandMemberRemoveEvent(Gamer var1, Gamer var2, Island var3) {
        this.owner = var1;
        this.member = var2;
        this.island = var3;

        super.call();
    }

    public Island getIsland() {
        return island;
    }

    public Gamer getOwner() {
        return owner;
    }

    public Gamer getMember() {
        return member;
    }

}
