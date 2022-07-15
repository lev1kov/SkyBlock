package lev1kov.skyblock.commands.command;

import lev1kov.skyblock.commands.SkyBlockCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class GamerCommand extends SkyBlockCommand {

    public GamerCommand() {
        super("gamer");
    }

    @Override
    public void execute(CommandSender sender, Command command, String[] args) {

    }

    @Override
    public List<String> complete(CommandSender sender, String[] args) {
        return super.complete(sender, args);
    }

}
