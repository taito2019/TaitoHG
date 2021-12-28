package de.taitopvp.hg;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void onDeath(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if (event.getDamage() >= player.getHealth()) {
                player.setHealth(5);
                player.setGameMode(GameMode.SPECTATOR);
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + ChatColor.YELLOW + " wurde von " + ChatColor.RED + event.getCause() + ChatColor.YELLOW + " Eliminiert!");
                Main.getLivingPlayers().remove(player);
                if (Main.getLivingPlayers().size() == 1) {
                    Bukkit.broadcastMessage((ChatColor.RED + Main.getLivingPlayers().get(0).getName() + "Hat die Runde Hardcore Games gewonnen"));
                }
                {
                }
            }
        }
    }
}