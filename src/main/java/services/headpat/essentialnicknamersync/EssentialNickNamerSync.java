package services.headpat.essentialnicknamersync;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EssentialNickNamerSync extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new NickNameListener(), this);
	}
}
