package org.volhvporechja.adv.rcc2016.contracts;

import java.util.Arrays;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class MartyRequest {
    public String secret;
    public String[] attempts;

    public MartyRequest() {
    }

    public MartyRequest(String secret, String[] attempts) {
        this.secret = secret;
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "MartyRequest{" +
                "secret='" + secret + '\'' +
                ", attempts=" + Arrays.toString(attempts) +
                '}';
    }
}
