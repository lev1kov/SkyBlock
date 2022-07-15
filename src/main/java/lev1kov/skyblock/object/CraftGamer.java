package lev1kov.skyblock.object;

import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lombok.NonNull;
import org.bukkit.entity.Player;

import java.util.Set;

public class CraftGamer implements Gamer {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public Island getOwnIsland() {
        return null;
    }

    @Override
    public Set<Island> getMemIslands() {
        return null;
    }

    @Override
    public void addIsland(@NonNull Island var1) {

    }

    @Override
    public void removeIsland(@NonNull Island var1) {

    }

    @Override
    public void setOwnIsland(Island var1) {

    }
}
