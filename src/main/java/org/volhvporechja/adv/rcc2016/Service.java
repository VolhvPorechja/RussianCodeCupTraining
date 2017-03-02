package org.volhvporechja.adv.rcc2016;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class Service {

    public static HttpServer startServer(String baseAddress, AbstractBinder binder){
        final ResourceConfig rc = new ResourceConfig().packages("org.volhvporechja.adv.rcc2016");
        rc.register(JacksonFeature.class);
        rc.register(binder);

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(baseAddress), rc);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Logger logger = LoggerFactory.getLogger("main");
        Configuration config = readConfig(Paths.get(args.length == 0 ? "config.yml" : args[0]), logger);

        final HttpServer httpServer = startServer(config.getServer().getUri(), new AbstractBinder() {
            @Override
            protected void configure() {
                bind(config).to(Configuration.class);
            }
        });

        logger.info("Started server WADL available on {}sapplication.wadl", config.getServer().getUri());
        System.in.read();
        httpServer.shutdown().wait();
    }

    /**
     * Read yaml config by specified path.
     * @param pathToConfig path to config
     * @param logger logger
     * @return Loaded configuration
     * @throws IOException
     */
    private static Configuration readConfig(Path pathToConfig, Logger logger) throws IOException {
        Yaml configFile = new Yaml();
        logger.debug("Loading config from {}", pathToConfig);
        try (InputStream inputStream = Files.newInputStream(pathToConfig)) {
            Configuration conf = configFile.loadAs(inputStream,Configuration.class);
            logger.debug("Loaded config {}", conf);
            return conf;
        }
    }
}
