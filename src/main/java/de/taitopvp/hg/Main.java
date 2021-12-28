package de.taitopvp.hg;


import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    private static ArrayList<Player> LivingPlayers = new ArrayList<Player>();

    public static ArrayList<Player> getLivingPlayers() {
        return LivingPlayers;
    }

    @Override
    public void onEnable() {
        this.getCommand("addplayers").setExecutor(new AddPlayers());
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new Soup(), this);
        manager.registerEvents(new OnDeath(), this);
        System.out.println("TaitoHG sucessfully enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
