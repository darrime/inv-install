package com.darrime.main;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
       getCommand("inv").setExecutor(new inv());
       getServer().getPluginManager().registerEvents(new InventoryListener(), this);
    }

    @Override
    public void onDisable() {

    }

}
