package lev1kov.skyblock.api;

import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.Set;

public interface Island {

    Gamer getOwner();

    Set<Gamer> getMembers();

    int getLevel();

    int getXp();

    // All mobs in distance 50 blocks
    Set<Entity> getNearbyMobs();

    // Central block island`s
    Location getLocation();

    /**
     * Adding xp
     * @param var1 xp
     */
    void addXp(int var1);

    /**
     * Creation of the island
     * @param var1 Player
     * @return False if the player already owns an island. True when the player became the owner of the island
     */
    boolean create(@NonNull Gamer var1);

    /**
     * Teleport the player to the island
     * @param var1 A gamer who wants to teleport to a given island
     */
    void teleport(@NonNull Gamer var1);

    /**
     * Adding a Player to an Island
     * @param var1 The player who wants to add to the island
     */
    void addMember(@NonNull Gamer var1);

    /**
     * Removing a player from an island
     * @param var1 Player to be removed
     */
    void removeMember(@NonNull Gamer var1);

    /**
     * Give the player an island. Player cannot have more than 1 island
     * @param var1 The player who will become the owner
     * @return False if the player already owns an island. True when the player became the owner of the island
     */
    boolean setOwner(@NonNull Gamer var1);

    /**
     * Deletes an island
     */
    void delete();

    /**
     * Completely demolish the island
     */
    void clear();

}
