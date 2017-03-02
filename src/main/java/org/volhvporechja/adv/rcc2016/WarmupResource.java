package org.volhvporechja.adv.rcc2016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.volhvporechja.adv.rcc2016.contracts.ChaosRequest;
import org.volhvporechja.adv.rcc2016.contracts.ChaosResponse;
import org.volhvporechja.adv.rcc2016.contracts.MartyRequest;
import org.volhvporechja.adv.rcc2016.contracts.MartyResponse;
import org.volhvporechja.adv.rcc2016.solvers.MartySecretSolver;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
@Path("/warmup")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WarmupResource {

    private final Logger logger;
    private final Configuration config;

    @Inject
    public WarmupResource(Configuration config) {
        this.config = config;
        logger = LoggerFactory.getLogger("warmup");
    }

    @POST @Path("/marty")
    public MartyResponse getMartyGuesses(MartyRequest request){
        logger.debug("Incomming request: {}", request);
        final MartyResponse martyResponse = new MartyResponse(MartySecretSolver.processAttempts(request.secret, request.attempts));
        logger.debug("Processed result: {}", martyResponse);
        return martyResponse;
    }

    @POST
    @Path("/chaos")
    public ChaosResponse getChaosMaxNumber(ChaosRequest request) {
        logger.debug("Incomming request: {}", request);
        return new ChaosResponse(3);
    }
}
