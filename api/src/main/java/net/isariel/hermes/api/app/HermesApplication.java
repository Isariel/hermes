package net.isariel.hermes.api.app;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public abstract class HermesApplication {

    /**
     * Handle that the application will get enabled.
     */
    protected abstract void doEnable();

    /**
     * Handle that the application will get disabled.
     */
    protected abstract void doDisable();
}
