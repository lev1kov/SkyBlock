package lev1kov.skyblock.object;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.Set;

public class CraftIsland implements Island {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Gamer getOwner() {
        return null;
    }

    @Override
    public Set<Gamer> getMembers() {
        return null;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getXp() {
        return 0;
    }

    @Override
    public Set<Entity> getNearbyMobs() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void addXp(int var1) {

    }

    @Override
    public boolean create(@NonNull Gamer var1) {
        return false;
    }

    @Override
    public void teleport(@NonNull Gamer var1) {

    }

    @Override
    public void addMember(@NonNull Gamer var1) {

    }

    @Override
    public void removeMember(@NonNull Gamer var1) {

    }

    @Override
    public boolean setOwner(@NonNull Gamer var1) {
        return false;
    }

    @Override
    public void delete() {

    }

    @Override
    public void clear() {

    }
}
