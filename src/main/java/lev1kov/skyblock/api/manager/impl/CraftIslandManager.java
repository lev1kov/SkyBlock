package lev1kov.skyblock.api.manager.impl;

import com.google.common.collect.Maps;
import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.Island;
import lev1kov.skyblock.api.manager.IslandManager;
import lombok.NonNull;

import java.util.Map;

import static lev1kov.skyblock.api.SkyBlockAPI.GamerManager;

public class CraftIslandManager implements IslandManager {

    private final Map<Gamer, Island> islandMap = Maps.newConcurrentMap();

    @Override
    public Island getDefaultIsland(@NonNull Gamer var1) {
        return null;
    }

    @Override
    public void addIsland(@NonNull Island var1) {
        islandMap.put(var1.getOwner(), var1);
    }

    @Override
    public void update(@NonNull Island var1) {
        //
    }

    @Override
    public Island getIsland(@NonNull String var1) {
        return islandMap.getOrDefault(GamerManager.getGamer(var1), null);
    }

    @Override
    public Island getIsland(@NonNull Gamer var1) {
        return islandMap.getOrDefault(var1, null);
    }
}
