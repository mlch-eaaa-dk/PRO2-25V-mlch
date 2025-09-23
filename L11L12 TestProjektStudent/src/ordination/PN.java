package ordination;

import java.time.LocalDate;

public class PN {
    private double antalEnheder;

    public double getAntalEnheder() {
        return antalEnheder;
    }

    /** Registrer datoen for en anvendt dosis. */
    public boolean anvendDosis(LocalDate dato) {
        // TODO
        return false;
    }

    /** Returner antal gange ordinationen er anvendt. */
    public int antalGangeAnvendt() {
        // TODO
        return -1;
    }
}
