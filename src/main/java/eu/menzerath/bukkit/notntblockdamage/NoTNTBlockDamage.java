package eu.menzerath.bukkit.notntblockdamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoTNTBlockDamage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the EventHandler
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        // Prevent any Block-Damage
        e.blockList().clear();
    }
}