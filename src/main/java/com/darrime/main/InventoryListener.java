package com.darrime.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class InventoryListener implements Listener {
    Player p;
    @EventHandler
    public void onPlayerClickInv(InventoryClickEvent e){
        if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "")){
            Player p = (Player) e.getWhoClicked();
            e.setCancelled(true);
        }
    }
}

