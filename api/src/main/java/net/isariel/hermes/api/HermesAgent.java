package net.isariel.hermes.api;

import com.google.inject.Module;
import net.isariel.hermes.api.app.HermesApplication;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface HermesAgent {

    /**
     * Initialize the given application via hermes.
     *
     * @param applicationClazz The class of the application.
     * @param <T> The type of the application.
     * @param modules The dependency modules.
     * @return The application instance.
     */
    <T extends HermesApplication> T initializeApplication(Class<T> applicationClazz, Module... modules);
}
