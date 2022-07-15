package lev1kov.skyblock.api;

import lombok.NonNull;
import org.bukkit.entity.Player;

import java.util.Set;

public interface Gamer {

    String getName();

    Player getPlayer();

    // Get own Island
    Island getOwnIsland();

    // Get all Islands where in members have Gamer
    Set<Island> getMemIslands();

    /**
     * Adding Island in MemIslands
     * @param var1 Island
     */
    void addIsland(@NonNull Island var1);

    /**
     * Remove Island in Memislands
     * @param var1 Island
     */
    void removeIsland(@NonNull Island var1);

    /**
     * Set ownIsland
     * @param var1 Island
     */
    void setOwnIsland(Island var1);

}
