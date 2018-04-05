package iyzach.CIAW.commands;

import java.awt.Color;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class CmdSummonBee implements Listener, CommandExecutor {

	public String name = "summonbee";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (!player.hasPermission("test.summon.bee"))
			{
			player.sendMessage(ChatColor.RED + "You are not worthy!");
			return true;
			}

			if(args.length==1) {
				try {
					int j = Integer.parseInt(args[0]);
					for(int i=0; i<j;i++) {
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "");
					}
				}catch(Exception e) {
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "");
				}
			}else {
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "");
			}
			


			return true;


		} else {
			sender.sendMessage(ChatColor.RED + "Only players can use this command...");
		}
		return true;
	}

}