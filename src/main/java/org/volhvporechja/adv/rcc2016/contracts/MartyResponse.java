package org.volhvporechja.adv.rcc2016.contracts;

import java.util.Arrays;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class MartyResponse {
    public MartyAttempt[] attempts;

    public MartyResponse() {
    }

    public MartyResponse(MartyAttempt[] attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "MartyResponse{" +
                "attempts=" + Arrays.toString(attempts) +
                '}';
    }
}
