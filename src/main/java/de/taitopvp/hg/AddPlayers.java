package de.taitopvp.hg;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddPlayers implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && sender.isOp()) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                Main.getLivingPlayers().add(p);

                System.out.println("Added: " + Main.getLivingPlayers().toString());
            }

        }
        return false;
    }
}
