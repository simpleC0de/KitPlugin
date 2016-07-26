package kits.Main;

import org.bukkit.plugin.java.JavaPlugin;

import kits.Command.Kit;

public class Main extends JavaPlugin{

	
	public void onEnable()
	{
	getCommand("kit").setExecutor(new Kit(this));	
	loadConfig();
	System.out.println("[SimpleKits] Successfully enabled.");
	}
	public void onDisable()
	{
		
	}
	public void loadConfig()
	{
		if(getDataFolder().exists())
		{
			reloadConfig();
		}
		else
		{
			getConfig().options().header("Source Code @Github");
			getConfig().set("enable", true);
			getConfig().set("Kits.Iron", true);
			getConfig().set("Kits.Gold", true);
			getConfig().set("Kits.Diamond", true);
			getConfig().set("Kits.Leather", true);
			getConfig().set("Kits.Archer", true);
			saveConfig();
		}
	}
}
