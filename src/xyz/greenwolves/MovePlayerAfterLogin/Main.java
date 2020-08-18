package xyz.greenwolves.MovePlayerAfterLogin;

import fr.xephi.authme.events.LoginEvent;
import fr.xephi.authme.libs.google.common.io.ByteArrayDataOutput;
import fr.xephi.authme.libs.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;


public class Main extends JavaPlugin implements Listener, PluginMessageListener {

    public static String server;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        loadConfiguration();
        server = getConfig().getString("server_name");
    }

    public void loadConfiguration() {
        getConfig().addDefault("server_name", "survival");
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @EventHandler
    public void onLogin(LoginEvent event) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF(server);
        event.getPlayer().sendPluginMessage(this, "BungeeCord", out.toByteArray());
    }

    @Override
    public void onDisable(){
        server = null;
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }
    }
}