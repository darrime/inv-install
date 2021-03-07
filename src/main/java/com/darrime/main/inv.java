package com.darrime.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class inv implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 27, "외형");
            ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE);
            ItemMeta meta = glass.getItemMeta();
            meta.setDisplayName(ChatColor.GRAY + "");
            inv.addItem(glass);


            for(int i = 0; i < 13; i++){
                inv.setItem(i, glass);
            }
            for(int i = 14; i < 27; i++){
                inv.setItem(i, glass);
            }

            p.openInventory(inv);
            new BukkitRunnable(){
                @Override
                public void run(){




                }
            }.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
            return true;
        }
        return false;
    }
}
