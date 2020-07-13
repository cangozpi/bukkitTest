package myPackageName.PluginName;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
            // do something...
            return true;
        } else if (cmd.getName().equalsIgnoreCase("basic2")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be run by a player.");
            } else {
                Player player = (Player) sender;
                // do something
            }
            return true;
        }
        return false;
    }



}