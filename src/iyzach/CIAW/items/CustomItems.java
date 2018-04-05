package iyzach.CIAW.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.Plugin;

import facemywrath.srlib.main.CustomRecipeLib;
import facemywrath.srlib.recipes.CShapedRecipe;

public class CustomItems implements Listener{

	private Plugin plugin;
	private List<ItemStack> items=new ArrayList<>();

	public CustomItems(Plugin pl) {
	//Strong Iron Helmet
		
		this.plugin = pl;
		items.add(new ItemStack(Material.IRON_HELMET,1));
		ItemStack item = items.get(0);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.BLUE + "Super Strong Iron Helmet");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Its just a strong helmet");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.isUnbreakable();
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		ShapedRecipe customItem = new ShapedRecipe(item);
		customItem.shape("YYY","Y#Y","###");
		customItem.setIngredient('Y', Material.IRON_BLOCK);

		plugin.getServer().addRecipe(customItem);
		
	//Strong Iron ChestPlate
		
		items.add(new ItemStack(Material.IRON_CHESTPLATE,1));
		item = items.get(1);
		meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.BLUE + "Super Strong Iron Chestplate");
		lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "How it's not heavy? I don't know...");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.isUnbreakable();
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("Y#Y","YYY","YYY");
		customItem.setIngredient('Y', Material.IRON_BLOCK);

		plugin.getServer().addRecipe(customItem);
		
	//Strong Iron Legs
		
		items.add(new ItemStack(Material.IRON_LEGGINGS,1));
		item = items.get(2);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Super Strong Iron Leggings");
		lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Good luck moving in these");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.isUnbreakable();
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("YYY","Y#Y","Y#Y");
		customItem.setIngredient('Y', Material.IRON_BLOCK);
		
		plugin.getServer().addRecipe(customItem);
		
	//Strong Iron Boots
		
		items.add(new ItemStack(Material.IRON_BOOTS,1));
		item = items.get(3);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Super Strong Iron Boots");
		lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Don't fall into any water");
		lore.add(ChatColor.BLUE + "Unless going to the water temple...");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.isUnbreakable();
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("###","Y#Y","Y#Y");
		customItem.setIngredient('Y', Material.IRON_BLOCK);


		plugin.getServer().addRecipe(customItem);
		
//StrongEnchantable (Gold With Unbreaking)
		//helmet
		
		items.add(new ItemStack(Material.GOLD_HELMET,1));
		item = items.get(4);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Tough Gold Helmet");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Good for Enchanting");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("OOO","G#G","###");
		customItem.setIngredient('O', Material.OBSIDIAN);
		customItem.setIngredient('G', Material.GOLD_INGOT);


		plugin.getServer().addRecipe(customItem);
		
		//ChestPlate
		
		items.add(new ItemStack(Material.GOLD_CHESTPLATE,1));
		item = items.get(5);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Tough Gold Chestplate");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Good for Enchanting");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("O#O","OGO","GGG");
		customItem.setIngredient('O', Material.OBSIDIAN);
		customItem.setIngredient('G', Material.GOLD_INGOT);


		plugin.getServer().addRecipe(customItem);
		
		
		//Legs
		
		items.add(new ItemStack(Material.GOLD_LEGGINGS,1));
		item = items.get(6);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Tough Gold Leggings");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Good for Enchanting");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("OOO","G#G","G#G");
		customItem.setIngredient('O', Material.OBSIDIAN);
		customItem.setIngredient('G', Material.GOLD_INGOT);


		plugin.getServer().addRecipe(customItem);
		
		//Boots
		
		items.add(new ItemStack(Material.GOLD_BOOTS,1));
		item = items.get(7);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "Tough Gold Boots");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Good for Enchanting");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("###","G#G","O#O");
		customItem.setIngredient('O', Material.OBSIDIAN);
		customItem.setIngredient('G', Material.GOLD_INGOT);


		plugin.getServer().addRecipe(customItem);
// Lazer Gun
		
		
		items.add(new ItemStack(Material.DIAMOND_SWORD,1));
		item = items.get(8);
		meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.BLUE + "LazerGun");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "This gun heats up");
		lore.add(ChatColor.DARK_PURPLE + "your friends and gems");
		lore.add(ChatColor.DARK_PURPLE + "manufactured by STAN CO");
		item.setDurability((short) 1270);
				
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.isUnbreakable();
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);	
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("NDO","O##","###");
		customItem.setIngredient('N', Material.NETHER_STAR);
		customItem.setIngredient('O', Material.OBSIDIAN);
		customItem.setIngredient('D', Material.DIAMOND);


		plugin.getServer().addRecipe(customItem);

		// LightStone
		
		ItemStack charcoal = new ItemStack(Material.COAL, 1, (short) 1);		
		items.add(charcoal);
		
		item = items.get(9);
		meta = item.getItemMeta();
				
		meta.setDisplayName(ChatColor.BLUE + "Lightstone");
		lore = new ArrayList<String>();	
		
		item.setItemMeta(meta);
		customItem = new ShapedRecipe(item);
		customItem.shape("DE#","###","###");
		customItem.setIngredient('E', Material.EMERALD);
		customItem.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(customItem);

	
	// Warp in a Bottle
		
		
		this.plugin = pl;
		items.add(new ItemStack(Material.CHORUS_FRUIT_POPPED, 1));
		item = items.get(10);
		meta = item.getItemMeta();
				
		meta.setDisplayName(ChatColor.BLUE + "WarpDust");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Used for crafting");
				
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		List<String> shape = Arrays.asList("ELA","AAA","AAA");
		HashMap<ItemStack, Character> keys = new HashMap<>();
		ItemStack E = new ItemStack(Material.ENDER_PEARL, 1);
		keys.put(E, 'E');
		keys.put(items.get(9), 'L');
		keys.put(new ItemStack(Material.AIR, 1), 'A');

		CustomRecipeLib.registerCustomRecipe(new CShapedRecipe(shape, keys, item));
			
		
	// Warp in a Bottle
		
		
		this.plugin = pl;
		items.add(new ItemStack(Material.DRAGONS_BREATH, 1));
		item = items.get(11);
		meta = item.getItemMeta();
				
		meta.setDisplayName(ChatColor.BLUE + "WarpCloud in a Bottle");
		lore = new ArrayList<String>();
		lore.add(ChatColor.DARK_PURPLE + "Sprays a warp cloud");
		lore.add(ChatColor.DARK_PURPLE + "So that you and other people");
		lore.add(ChatColor.DARK_PURPLE + "near you can warp to places");
				
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		shape = Arrays.asList("BPA","AAA","AAA");
		keys = new HashMap<>();
		ItemStack B = new ItemStack(Material.GLASS_BOTTLE, 1);
		keys.put(B, 'B');
		keys.put(items.get(10), 'P');
		keys.put(new ItemStack(Material.AIR, 1), 'A');

		CustomRecipeLib.registerCustomRecipe(new CShapedRecipe(shape, keys, item));
			
	}
	public ItemStack getItem(int i) {
		return this.items.get(i);

	}
}
