package lev1kov.skyblock.commands;

import lev1kov.skyblock.SkyBlock;
import org.bukkit.command.*;

import java.util.ArrayList;
import java.util.List;

public abstract class SkyBlockCommand implements CommandExecutor, TabExecutor {

    public SkyBlockCommand(String name) {
        PluginCommand pluginCommand = SkyBlock.getInstance().getCommand(name);
        if (pluginCommand != null) {
            pluginCommand.setExecutor(this);
            pluginCommand.setTabCompleter(this);
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        execute(sender, command, args);
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return filter(complete(sender, args), args);
    }

    public abstract void execute(CommandSender sender, Command command, String[] args);

    public List<String> complete(CommandSender sender, String[] args) {
        return null;
    }

    private List<String> filter(List<String> list, String[] args) {
        if (list == null) return null;
        String last = args[args.length - 1];
        List<String> result = new ArrayList<>();
        for(String arg : list) {
            if (arg.toLowerCase().startsWith(last.toLowerCase())) result.add(arg);
        }
        return result;
    }

}
