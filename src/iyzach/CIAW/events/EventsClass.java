package iyzach.CIAW.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import iyzach.CIAW.main.CIAW;

public class EventsClass implements Listener {
	private CIAW plugin;
	public EventsClass(CIAW pl) {
		this.plugin = pl;
	}
	
	@EventHandler
	// If Item right clicked remove 1 and execute command, item being the getItem(X)
	public void onPlayerUse(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		
		/*if(player.getItemInHand().isSimilar(plugin.getCustomItems().getItem(0))) {
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "");
			if(player.getItemInHand().getAmount()>0) {
				ItemStack item = player.getItemInHand();
				item.setAmount(item.getAmount()-1);
				player.setItemInHand(item);
			}else {
				player.setItemInHand(null);
			}
		}*/
	}
	@EventHandler
	public void playerplace(BlockPlaceEvent e) {
		if(e.getItemInHand().isSimilar(plugin.getCustomItems().getItem(0)) || e.getItemInHand().isSimilar(plugin.getCustomItems().getItem(1)))
			e.setCancelled(true);
	}
}
