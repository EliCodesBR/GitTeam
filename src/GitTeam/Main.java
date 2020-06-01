package GitTeam;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {
        setPlugin(this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void setPlugin(Main main){
        plugin = main;
    }

    public static Main getPlugin(){
        return plugin;
    }
}
