package org.volhvporechja.adv.rcc2016.contracts;

import java.util.Arrays;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class ChaosRequest {
    public int[] numbers;

    public ChaosRequest() {
    }

    public ChaosRequest(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ChaosRequest{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
