package de.taitopvp.hg;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Soup implements Listener {

    @EventHandler
    public void onSoup(PlayerInteractEvent event){
        Player p = event.getPlayer();

        if(p.getInventory().getItemInMainHand().getType() == Material.MUSHROOM_STEW) {
            if(p.getHealth()<p.getMaxHealth()){
                double health = p.getHealth() * 3.5;
                if(health > p.getMaxHealth()){
                    health = p.getMaxHealth();
                }
                p.setHealth(health);
                p.getInventory().setItemInMainHand(new ItemStack(Material.BOWL));
            }

        }
    }
}
