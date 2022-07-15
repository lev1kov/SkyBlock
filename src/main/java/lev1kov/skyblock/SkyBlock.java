package lev1kov.skyblock;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlock extends JavaPlugin {

    private static SkyBlock instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    public void stop() {
        Bukkit.getPluginManager().disablePlugin(this);
    }

    public static SkyBlock getInstance() {
        return instance;
    }

}
