package org.volhvporechja.adv.rcc2016.solvers;

import org.volhvporechja.adv.rcc2016.contracts.MartyAttempt;

import java.util.Arrays;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class MartySecretSolver {

    public static MartyAttempt[] processAttempts(String secret, String[] attempts) {
        return Arrays.stream(attempts).map(atmp -> processAttempt(secret,atmp)).toArray(MartyAttempt[]::new);
    }

    private static MartyAttempt processAttempt(String secret, String attempt) {
        int inPlace = 0;
        int notInPlace = 0;
        for (int i = 0; i < secret.length(); i++) {
            if(attempt.charAt(i) == secret.charAt(i))
                inPlace++;
            else if(secret.indexOf(attempt.charAt(i)) != -1)
                notInPlace++;
        }

        return new MartyAttempt(inPlace,notInPlace);
    }
}
