package org.volhvporechja.adv.rcc2016.contracts;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class MartyAttempt {
    public int inPlace;
    public int notInPlace;

    public MartyAttempt() {
    }

    public MartyAttempt(int inPlace, int notInPlace) {
        this.inPlace = inPlace;
        this.notInPlace = notInPlace;
    }

    @Override
    public String toString() {
        return "MartyAttempt{" +
                "inPlace=" + inPlace +
                ", notInPlace=" + notInPlace +
                '}';
    }
}
