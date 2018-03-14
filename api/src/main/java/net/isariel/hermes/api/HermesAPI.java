package net.isariel.hermes.api;


import javax.inject.Inject;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class HermesAPI {

    @Inject
    private static HermesAgent hermesAgent;

    /**
     * Get the hermes agent instance.
     *
     * This will throw an {@link IllegalStateException} when hermes wasn't setup yet.
     *
     * @return The hermes agent.
     */
    public static HermesAgent getAgent() {
        if (hermesAgent == null) {
            throw new IllegalStateException("Hermes agent wasn't initialized yet.");
        }

        return hermesAgent;
    }
}
