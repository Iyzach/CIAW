package iyzach.CIAW.main;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import iyzach.CIAW.commands.CmdSummonBee;
import iyzach.CIAW.events.EventsClass;
import iyzach.CIAW.items.CustomItems;

public class CIAW extends JavaPlugin implements Listener {
	private CmdSummonBee cmd1 = new CmdSummonBee();

	private EventsClass ec = new EventsClass(this);
	private CustomItems ci;

	public void onEnable(){
		getCommand(cmd1.name).setExecutor(cmd1);
		getServer().getPluginManager().registerEvents(ec, this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nCIAW has been Enabled\n\n");
		CIAW pl = this;
		this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
		{
			public void run() {
				ci = new CustomItems(pl);
			}
		}, 20L);

	}
	public void onDisable(){
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nCIAW has been Disabled\n\n");
	}
	public CustomItems getCustomItems() {
		return this.ci;
	}
}