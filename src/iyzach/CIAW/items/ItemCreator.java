package iyzach.CIAW.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCreator{
	private ItemStack item;

	public ItemCreator(Material mat)
	{
		this.item = new ItemStack(mat, 1);
	}

	public ItemCreator setAmount(int i)
	{
		this.item.setAmount(i);
		return this;
	}

	public ItemCreator setDisplayname(String display)
	{
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(display);
		item.setItemMeta(meta);
		return this;
	}

	public ItemCreator setLore(List<String> lore)
	{
		ItemMeta meta = item.getItemMeta();
		List<String> newLore = new ArrayList<>();
		for(String str : lore)
		{
			newLore.add(ChatColor.translateAlternateColorCodes('&', str));
		}
		meta.setLore(newLore);
		item.setItemMeta(meta);
		return this;
	}

	public ItemCreator setDurabilty(int i)
	{
		item.setDurability((byte) i);
		return this;
	}

	public ItemStack getItem()
	{
		return this.item;
	}
}