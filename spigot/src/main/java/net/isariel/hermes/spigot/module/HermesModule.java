package net.isariel.hermes.spigot.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import net.isariel.hermes.api.HermesAPI;
import net.isariel.hermes.spigot.HermesSpigotPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class HermesModule extends AbstractModule {

    private final HermesSpigotPlugin hermesSpigotPlugin;

    public HermesModule(HermesSpigotPlugin hermesSpigotPlugin) {
        this.hermesSpigotPlugin = hermesSpigotPlugin;
    }

    @Override
    protected void configure() {
        requestStaticInjection(HermesAPI.class);

        bind(Plugin.class).annotatedWith(Names.named("hermesPlugin")).toInstance(hermesSpigotPlugin);
        bind(PluginManager.class).toInstance(Bukkit.getPluginManager());
        bind(Server.class).toInstance(Bukkit.getServer());
    }
}
