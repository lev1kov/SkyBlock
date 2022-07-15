package lev1kov.skyblock.api.economy.impl;

import lev1kov.skyblock.api.economy.SBEconomy;
import lombok.NonNull;
import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.PlayerPointsAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Objects;

public class PlayerPointsEconomy implements SBEconomy {

    private final PlayerPointsAPI playerPointsAPI;

    public PlayerPointsEconomy() {
        playerPointsAPI = Objects.requireNonNull((PlayerPoints) Bukkit.getPluginManager().getPlugin("PlayerPoints")).getAPI();
    }

    @Override
    public void take(@NonNull Player var1, int var2) {
        playerPointsAPI.take(var1.getUniqueId(), var2);
    }

    @Override
    public int get(@NonNull Player var1) {
        return playerPointsAPI.look(var1.getUniqueId());
    }
}
