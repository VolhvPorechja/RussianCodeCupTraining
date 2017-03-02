package org.volhvporechja.adv.rcc2016;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class Configuration {
    public ServerConfiguration getServer() {
        return server;
    }

    public void setServer(ServerConfiguration server) {
        this.server = server;
    }

    private ServerConfiguration server;

    @Override
    public String toString() {
        return "Configuration{" +
                "server=" + server +
                '}';
    }
}
