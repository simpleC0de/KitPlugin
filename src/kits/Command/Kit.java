package kits.Command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import kits.Main.Main;

public class Kit implements CommandExecutor{

	private Main plugin;
	public Kit(Main plugin)
	{
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if(cs instanceof Player)
		{
			Player p = (Player)cs;
			if(cmd.getLabel().equalsIgnoreCase("kit"))
			{
				if(plugin.getConfig().getBoolean("enable") == true)
				{
					switch(args.length)
					{
					case 0:
					{
						p.sendMessage(ChatColor.RED + "/kit <Kit>");
					}
					
					case 1:
					{
						try
						{
							if(args[0].equalsIgnoreCase("Iron"))
							{
								if(plugin.getConfig().getBoolean("Kits.Iron") == true)
								{
									if(plugin.getConfig().contains(p.getUniqueId().toString()))
									{
										int i = plugin.getConfig().getInt(p.getUniqueId().toString());
										if(i == 1)
										{
											p.sendMessage(ChatColor.RED + "You cant use that yet.");
										}
										else
										{
											try
											{
												ItemStack oldhelmet = p.getInventory().getHelmet();
												ItemStack oldbra = p.getInventory().getChestplate();
												ItemStack oldlegging = p.getInventory().getLeggings();
												ItemStack oldshoe = p.getInventory().getBoots();
												ItemStack sword = new ItemStack(Material.IRON_SWORD);
												ItemStack shovel = new ItemStack(Material.IRON_SPADE);
												ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
												ItemStack axe = new ItemStack(Material.IRON_AXE);
												ItemStack hoe = new ItemStack(Material.IRON_HOE);
												ItemStack helmet = new ItemStack(Material.IRON_HELMET);
												ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
												ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
												ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
												p.getInventory().addItem(sword);
												p.getInventory().addItem(shovel);
												p.getInventory().addItem(pickaxe);
												p.getInventory().addItem(axe);
												p.getInventory().addItem(hoe);
												p.getInventory().setHelmet(helmet);
												p.getInventory().addItem(oldhelmet);
												p.getInventory().setChestplate(bra);
												p.getInventory().addItem(oldbra);
												p.getInventory().setChestplate(legging);
												p.getInventory().addItem(oldlegging);
												p.getInventory().setBoots(shoe);
												p.getInventory().addItem(oldshoe);
											}catch(Exception exx) 
											{
												return true;
											}
											
										}
										new BukkitRunnable() {
											int cd = 600;
											@Override
											public void run() {
												cd--;
												if(cd == 0)
												{
													plugin.getConfig().set(p.getUniqueId().toString(), 0);
													plugin.saveConfig();
													p.sendMessage(ChatColor.RED + "You can use the Ironkit again!");
													cancel();
												}
												
											}
										}.runTaskTimer(plugin, 0, 20);
									}
									else
									{
										plugin.getConfig().set(p.getUniqueId().toString(), 1);
										plugin.saveConfig();
										ItemStack sword = new ItemStack(Material.IRON_SWORD);
										ItemStack shovel = new ItemStack(Material.IRON_SPADE);
										ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
										ItemStack axe = new ItemStack(Material.IRON_AXE);
										ItemStack hoe = new ItemStack(Material.IRON_HOE);
										ItemStack helmet = new ItemStack(Material.IRON_HELMET);
										ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
										ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
										ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
										p.getInventory().addItem(sword);
										p.getInventory().addItem(shovel);
										p.getInventory().addItem(pickaxe);
										p.getInventory().addItem(axe);
										p.getInventory().addItem(hoe);
										ItemStack oldhelmet = p.getInventory().getHelmet();
										p.getInventory().setHelmet(helmet);
										p.getInventory().addItem(oldhelmet);
										ItemStack oldbra = p.getInventory().getChestplate();
										p.getInventory().setChestplate(bra);
										p.getInventory().addItem(oldbra);
										ItemStack oldlegging = p.getInventory().getLeggings();
										p.getInventory().setChestplate(legging);
										p.getInventory().addItem(oldlegging);
										ItemStack oldshoe = p.getInventory().getBoots();
										p.getInventory().setBoots(shoe);
										p.getInventory().addItem(oldshoe);
									}
									
									}
								else
								{
									p.sendMessage(ChatColor.RED + "This Kit is currently disabled., Iron");
								}
							}
							else if(args[0].equalsIgnoreCase("Gold"))
							{
								if(plugin.getConfig().getBoolean("Kits.Gold") == true)
								{
									if(plugin.getConfig().contains(p.getUniqueId().toString()))
									{
										int i = plugin.getConfig().getInt(p.getUniqueId().toString());
										if(i == 1)
										{
											p.sendMessage(ChatColor.RED + "You cant use that yet.");
										}
										else
										{
											try
											{
												ItemStack oldhelmet = p.getInventory().getHelmet();
												ItemStack oldbra = p.getInventory().getChestplate();
												ItemStack oldlegging = p.getInventory().getLeggings();
												ItemStack oldshoe = p.getInventory().getBoots();
												ItemStack sword = new ItemStack(Material.IRON_SWORD);
												ItemStack shovel = new ItemStack(Material.IRON_SPADE);
												ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
												ItemStack axe = new ItemStack(Material.IRON_AXE);
												ItemStack hoe = new ItemStack(Material.IRON_HOE);
												ItemStack helmet = new ItemStack(Material.IRON_HELMET);
												ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
												ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
												ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
												p.getInventory().addItem(sword);
												p.getInventory().addItem(shovel);
												p.getInventory().addItem(pickaxe);
												p.getInventory().addItem(axe);
												p.getInventory().addItem(hoe);
												p.getInventory().setHelmet(helmet);
												p.getInventory().addItem(oldhelmet);
												p.getInventory().setChestplate(bra);
												p.getInventory().addItem(oldbra);
												p.getInventory().setChestplate(legging);
												p.getInventory().addItem(oldlegging);
												p.getInventory().setBoots(shoe);
												p.getInventory().addItem(oldshoe);
											}catch(Exception exx) 
											{
												return true;
											}
											
										}
										new BukkitRunnable() {
											int cd = 600;
											@Override
											public void run() {
												cd--;
												if(cd == 0)
												{
													plugin.getConfig().set(p.getUniqueId().toString(), 0);
													plugin.saveConfig();
													p.sendMessage(ChatColor.RED + "You can use the Ironkit again!");
													cancel();
												}
												
											}
										}.runTaskTimer(plugin, 0, 20);
									}
									else
									{
										plugin.getConfig().set(p.getUniqueId().toString(), 1);
										plugin.saveConfig();
										ItemStack sword = new ItemStack(Material.GOLD_SWORD);
										ItemStack shovel = new ItemStack(Material.GOLD_SPADE);
										ItemStack pickaxe = new ItemStack(Material.GOLD_PICKAXE);
										ItemStack axe = new ItemStack(Material.GOLD_AXE);
										ItemStack hoe = new ItemStack(Material.GOLD_HOE);
										ItemStack helmet = new ItemStack(Material.GOLD_HELMET);
										ItemStack bra = new ItemStack(Material.GOLD_CHESTPLATE);
										ItemStack legging = new ItemStack(Material.GOLD_LEGGINGS);
										ItemStack shoe = new ItemStack(Material.GOLD_BOOTS);
										p.getInventory().addItem(sword);
										p.getInventory().addItem(shovel);
										p.getInventory().addItem(pickaxe);
										p.getInventory().addItem(axe);
										p.getInventory().addItem(hoe);
										ItemStack oldhelmet = p.getInventory().getHelmet();
										p.getInventory().setHelmet(helmet);
										p.getInventory().addItem(oldhelmet);
										ItemStack oldbra = p.getInventory().getChestplate();
										p.getInventory().setChestplate(bra);
										p.getInventory().addItem(oldbra);
										ItemStack oldlegging = p.getInventory().getLeggings();
										p.getInventory().setChestplate(legging);
										p.getInventory().addItem(oldlegging);
										ItemStack oldshoe = p.getInventory().getBoots();
										p.getInventory().setBoots(shoe);
										p.getInventory().addItem(oldshoe);
									}
								}
								else
								{
									p.sendMessage(ChatColor.RED + "This Kit is currently disabled., Gold");
								}
							}
							else if(args[0].equalsIgnoreCase("Leather"))
							{
								if(plugin.getConfig().getBoolean("Kits.Leather") == true)
								{
									if(plugin.getConfig().contains(p.getUniqueId().toString()))
									{
										int i = plugin.getConfig().getInt(p.getUniqueId().toString());
										if(i == 1)
										{
											p.sendMessage(ChatColor.RED + "You cant use that yet.");
										}
										else
										{
											try
											{
												ItemStack oldhelmet = p.getInventory().getHelmet();
												ItemStack oldbra = p.getInventory().getChestplate();
												ItemStack oldlegging = p.getInventory().getLeggings();
												ItemStack oldshoe = p.getInventory().getBoots();
												ItemStack sword = new ItemStack(Material.IRON_SWORD);
												ItemStack shovel = new ItemStack(Material.IRON_SPADE);
												ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
												ItemStack axe = new ItemStack(Material.IRON_AXE);
												ItemStack hoe = new ItemStack(Material.IRON_HOE);
												ItemStack helmet = new ItemStack(Material.IRON_HELMET);
												ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
												ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
												ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
												p.getInventory().addItem(sword);
												p.getInventory().addItem(shovel);
												p.getInventory().addItem(pickaxe);
												p.getInventory().addItem(axe);
												p.getInventory().addItem(hoe);
												p.getInventory().setHelmet(helmet);
												p.getInventory().addItem(oldhelmet);
												p.getInventory().setChestplate(bra);
												p.getInventory().addItem(oldbra);
												p.getInventory().setChestplate(legging);
												p.getInventory().addItem(oldlegging);
												p.getInventory().setBoots(shoe);
												p.getInventory().addItem(oldshoe);
											}catch(Exception exx) 
											{
												return true;
											}
											
										}
										new BukkitRunnable() {
											int cd = 600;
											@Override
											public void run() {
												cd--;
												if(cd == 0)
												{
													plugin.getConfig().set(p.getUniqueId().toString(), 0);
													plugin.saveConfig();
													p.sendMessage(ChatColor.RED + "You can use the Ironkit again!");
													cancel();
												}
												
											}
										}.runTaskTimer(plugin, 0, 20);
									}
									else
									{
										plugin.getConfig().set(p.getUniqueId().toString(), 1);
										plugin.saveConfig();
										ItemStack sword = new ItemStack(Material.WOOD_SWORD);
										ItemStack shovel = new ItemStack(Material.WOOD_SPADE);
										ItemStack pickaxe = new ItemStack(Material.WOOD_PICKAXE);
										ItemStack axe = new ItemStack(Material.WOOD_AXE);
										ItemStack hoe = new ItemStack(Material.WOOD_HOE);
										ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
										ItemStack bra = new ItemStack(Material.LEATHER_CHESTPLATE);
										ItemStack legging = new ItemStack(Material.LEATHER_LEGGINGS);
										ItemStack shoe = new ItemStack(Material.LEATHER_BOOTS);
										p.getInventory().addItem(sword);
										p.getInventory().addItem(shovel);
										p.getInventory().addItem(pickaxe);
										p.getInventory().addItem(axe);
										p.getInventory().addItem(hoe);
										ItemStack oldhelmet = p.getInventory().getHelmet();
										p.getInventory().setHelmet(helmet);
										p.getInventory().addItem(oldhelmet);
										ItemStack oldbra = p.getInventory().getChestplate();
										p.getInventory().setChestplate(bra);
										p.getInventory().addItem(oldbra);
										ItemStack oldlegging = p.getInventory().getLeggings();
										p.getInventory().setChestplate(legging);
										p.getInventory().addItem(oldlegging);
										ItemStack oldshoe = p.getInventory().getBoots();
										p.getInventory().setBoots(shoe);
										p.getInventory().addItem(oldshoe);
									}
								}
								else
								{
									p.sendMessage(ChatColor.RED + "This Kit is currently disabled.,Leather");
								}
							}
							else if(args[0].equalsIgnoreCase("Diamond"))
							{
								if(plugin.getConfig().getBoolean("Kits.Diamond") == true)
								{
									if(plugin.getConfig().contains(p.getUniqueId().toString()))
									{
										int i = plugin.getConfig().getInt(p.getUniqueId().toString());
										if(i == 1)
										{
											p.sendMessage(ChatColor.RED + "You cant use that yet.");
										}
										else
										{
											try
											{
												ItemStack oldhelmet = p.getInventory().getHelmet();
												ItemStack oldbra = p.getInventory().getChestplate();
												ItemStack oldlegging = p.getInventory().getLeggings();
												ItemStack oldshoe = p.getInventory().getBoots();
												ItemStack sword = new ItemStack(Material.IRON_SWORD);
												ItemStack shovel = new ItemStack(Material.IRON_SPADE);
												ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
												ItemStack axe = new ItemStack(Material.IRON_AXE);
												ItemStack hoe = new ItemStack(Material.IRON_HOE);
												ItemStack helmet = new ItemStack(Material.IRON_HELMET);
												ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
												ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
												ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
												p.getInventory().addItem(sword);
												p.getInventory().addItem(shovel);
												p.getInventory().addItem(pickaxe);
												p.getInventory().addItem(axe);
												p.getInventory().addItem(hoe);
												p.getInventory().setHelmet(helmet);
												p.getInventory().addItem(oldhelmet);
												p.getInventory().setChestplate(bra);
												p.getInventory().addItem(oldbra);
												p.getInventory().setChestplate(legging);
												p.getInventory().addItem(oldlegging);
												p.getInventory().setBoots(shoe);
												p.getInventory().addItem(oldshoe);
											}catch(Exception exx) 
											{
												return true;
											}
											
										}
										new BukkitRunnable() {
											int cd = 600;
											@Override
											public void run() {
												cd--;
												if(cd == 0)
												{
													plugin.getConfig().set(p.getUniqueId().toString(), 0);
													plugin.saveConfig();
													p.sendMessage(ChatColor.RED + "You can use the Ironkit again!");
													cancel();
												}
												
											}
										}.runTaskTimer(plugin, 0, 20);
									}
									else
									{
										plugin.getConfig().set(p.getUniqueId().toString(), 1);
										plugin.saveConfig();
										ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
										ItemStack shovel = new ItemStack(Material.DIAMOND_SPADE);
										ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
										ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
										ItemStack hoe = new ItemStack(Material.DIAMOND_HOE);
										ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
										ItemStack bra = new ItemStack(Material.DIAMOND_CHESTPLATE);
										ItemStack legging = new ItemStack(Material.DIAMOND_LEGGINGS);
										ItemStack shoe = new ItemStack(Material.DIAMOND_BOOTS);
										p.getInventory().addItem(sword);
										p.getInventory().addItem(shovel);
										p.getInventory().addItem(pickaxe);
										p.getInventory().addItem(axe);
										p.getInventory().addItem(hoe);
										ItemStack oldhelmet = p.getInventory().getHelmet();
										p.getInventory().setHelmet(helmet);
										p.getInventory().addItem(oldhelmet);
										ItemStack oldbra = p.getInventory().getChestplate();
										p.getInventory().setChestplate(bra);
										p.getInventory().addItem(oldbra);
										ItemStack oldlegging = p.getInventory().getLeggings();
										p.getInventory().setChestplate(legging);
										p.getInventory().addItem(oldlegging);
										ItemStack oldshoe = p.getInventory().getBoots();
										p.getInventory().setBoots(shoe);
										p.getInventory().addItem(oldshoe);
									}
								}
								else
								{
									p.sendMessage(ChatColor.RED + "This Kit is currently disabled., Dia");
								}
							}
							else if(args[0].equalsIgnoreCase("Archer"))
							{
								if(plugin.getConfig().getBoolean("Kits.Archer") == true)
								{
									
									if(plugin.getConfig().contains(p.getUniqueId().toString()))
									{
										int i = plugin.getConfig().getInt(p.getUniqueId().toString());
										if(i == 1)
										{
											p.sendMessage(ChatColor.RED + "You cant use that yet.");
										}
										else
										{
											try
											{
												ItemStack oldhelmet = p.getInventory().getHelmet();
												ItemStack oldbra = p.getInventory().getChestplate();
												ItemStack oldlegging = p.getInventory().getLeggings();
												ItemStack oldshoe = p.getInventory().getBoots();
												ItemStack sword = new ItemStack(Material.WOOD_SWORD);
												ItemStack shovel = new ItemStack(Material.WOOD_SPADE);
												ItemStack pickaxe = new ItemStack(Material.WOOD_PICKAXE);
												ItemStack axe = new ItemStack(Material.WOOD_AXE);
												ItemStack hoe = new ItemStack(Material.WOOD_HOE);
												ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
												ItemStack bra = new ItemStack(Material.LEATHER_CHESTPLATE);
												ItemStack legging = new ItemStack(Material.LEATHER_LEGGINGS);
												ItemStack shoe = new ItemStack(Material.LEATHER_BOOTS);
												ItemStack bow = new ItemStack(Material.BOW);
												ItemStack arrow = new ItemStack(Material.ARROW, 32);
												p.getInventory().addItem(bow);
												p.getInventory().addItem(arrow);
												p.getInventory().addItem(sword);
												p.getInventory().addItem(shovel);
												p.getInventory().addItem(pickaxe);
												p.getInventory().addItem(axe);
												p.getInventory().addItem(hoe);
												p.getInventory().setHelmet(helmet);
												p.getInventory().addItem(oldhelmet);
												p.getInventory().setChestplate(bra);
												p.getInventory().addItem(oldbra);
												p.getInventory().setChestplate(legging);
												p.getInventory().addItem(oldlegging);
												p.getInventory().setBoots(shoe);
												p.getInventory().addItem(oldshoe);
											}catch(Exception exx) 
											{
												return true;
											}
											
										}
										new BukkitRunnable() {
											int cd = 600;
											@Override
											public void run() {
												cd--;
												if(cd == 0)
												{
													plugin.getConfig().set(p.getUniqueId().toString(), 0);
													plugin.saveConfig();
													p.sendMessage(ChatColor.RED + "You can use the Ironkit again!");
													cancel();
												}
												
											}
										}.runTaskTimer(plugin, 0, 20);
									}
									else
									{
										plugin.getConfig().set(p.getUniqueId().toString(), 1);
										plugin.saveConfig();
										ItemStack sword = new ItemStack(Material.IRON_SWORD);
										ItemStack shovel = new ItemStack(Material.IRON_SPADE);
										ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
										ItemStack axe = new ItemStack(Material.IRON_AXE);
										ItemStack hoe = new ItemStack(Material.IRON_HOE);
										ItemStack helmet = new ItemStack(Material.IRON_HELMET);
										ItemStack bra = new ItemStack(Material.IRON_CHESTPLATE);
										ItemStack legging = new ItemStack(Material.IRON_LEGGINGS);
										ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
										p.getInventory().addItem(sword);
										p.getInventory().addItem(shovel);
										p.getInventory().addItem(pickaxe);
										p.getInventory().addItem(axe);
										p.getInventory().addItem(hoe);
										ItemStack oldhelmet = p.getInventory().getHelmet();
										p.getInventory().setHelmet(helmet);
										p.getInventory().addItem(oldhelmet);
										ItemStack oldbra = p.getInventory().getChestplate();
										p.getInventory().setChestplate(bra);
										p.getInventory().addItem(oldbra);
										ItemStack oldlegging = p.getInventory().getLeggings();
										p.getInventory().setChestplate(legging);
										p.getInventory().addItem(oldlegging);
										ItemStack oldshoe = p.getInventory().getBoots();
										p.getInventory().setBoots(shoe);
										p.getInventory().addItem(oldshoe);
									}
								}
								else
								{
									p.sendMessage(ChatColor.RED + "This Kit is currently disabled., Arch");
								}
							}
							else if(args[0].equalsIgnoreCase("kits"))
							{
								p.sendMessage(ChatColor.AQUA + "/kit <Iron> <Gold> <Leather> <Diamond> <Archer>");
							}
							else
							{
								p.sendMessage(ChatColor.RED + "/kit kits");
							}
						
						
						if(args.length > 1)
						{
							p.sendMessage(ChatColor.RED + "/kit <Kit>");
						}
						
						
					
						}catch(ArrayIndexOutOfBoundsException ex)
						{
							return true;
						}
						
			}
					
				

		return true;
	}


			
	}
	}
		}
		return true;
	}
}



	

