package org.volhvporechja.adv.rcc2016.contracts;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class ChaosResponse {
    public int maxNumber;

    public ChaosResponse() {
    }

    public ChaosResponse(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public String toString() {
        return "ChaosResponse{" +
                "maxNumber='" + maxNumber + '\'' +
                '}';
    }
}
