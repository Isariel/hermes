package net.isariel.hermes.spigot;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import net.isariel.hermes.api.HermesAgent;
import net.isariel.hermes.api.app.HermesApplication;
import net.isariel.hermes.spigot.module.HermesModule;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class HermesSpigotPlugin extends JavaPlugin implements HermesAgent {

    private Injector injector;

    @Override
    public void onEnable() {
        injector = Guice.createInjector(new HermesModule(this));
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public <T extends HermesApplication> T initializeApplication(Class<T> applicationClazz, Module... modules) {
        Injector injector = this.injector.createChildInjector(modules);
        return injector.getInstance(applicationClazz);
    }
}
