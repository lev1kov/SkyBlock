package lev1kov.skyblock.api.manager.impl;

import com.google.common.collect.Maps;
import lev1kov.skyblock.api.Gamer;
import lev1kov.skyblock.api.manager.GamerManager;
import lombok.NonNull;
import org.bukkit.entity.Player;

import java.util.Map;

public class CraftGamerManager implements GamerManager {

    private final Map<String, Gamer> gamerMap = Maps.newConcurrentMap();

    @Override
    public Gamer getDefaultGamer(@NonNull Player var1) {
        return null;
    }

    @Override
    public void addGamer(@NonNull Gamer var1) {
        gamerMap.put(var1.getName(), var1);
    }

    @Override
    public void update(@NonNull Gamer var1) {
        //
    }

    @Override
    public Gamer getGamer(@NonNull String var1) {
        return gamerMap.getOrDefault(var1, null);
    }

    @Override
    public Gamer getGamer(@NonNull Player var1) {
        return gamerMap.getOrDefault(var1.getName(), null);
    }
}
