package com.hawkfalcon.DeathSwap;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class StatsConfig {
	
	private DeathSwap pl;
	
	public StatsConfig(DeathSwap ins) {
		
		pl = ins;
		
	}
	
	private FileConfiguration stats;
	private File f;

	public void setup() {
		
		f = new File(pl.getDataFolder(), "stats.yml");
		
	    try {
	    	
	      if (!f.exists())
	        f.createNewFile();
	      
	    } catch (Exception localException) {
	    }
	    
	    reloadStats();
	    saveStats();
	    reloadStats();
	    
	}

	public void reloadStats() {
		
	    stats = YamlConfiguration.loadConfiguration(f);
	    
	}

	public void saveStats() {
		  
	    try {
	    	
	      stats.save(f);
	      
	    }
	    catch (IOException e) {
	    	
	      e.printStackTrace();
	      
	    }
	    
	}
	
}
