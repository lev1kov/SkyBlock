package lev1kov.skyblock.api.economy.impl;

import lev1kov.skyblock.SkyBlock;
import lev1kov.skyblock.api.economy.SBEconomy;
import lombok.NonNull;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.RegisteredServiceProvider;

import static org.bukkit.Bukkit.getServer;

public class VaultSBEconomy implements SBEconomy {

    private Economy econ = null;
    private Permission perms = null;
    private Chat chat = null;

    public VaultSBEconomy() {
        if (!setupEconomy()) {
            SkyBlock.getInstance().stop();
            return;
        }
        setupPermissions();
        setupChat();
    }

    @Override
    public void take(@NonNull Player var1, int var2) {
        econ.withdrawPlayer(var1, var2);
    }

    @Override
    public int get(@NonNull Player var1) {
        return (int) econ.getBalance(var1);
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    private boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp = getServer().getServicesManager().getRegistration(Chat.class);
        chat = rsp.getProvider();
        return chat != null;
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }

}
