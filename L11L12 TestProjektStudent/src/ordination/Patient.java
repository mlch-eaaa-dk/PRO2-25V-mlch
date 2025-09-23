package ordination;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String cprNr;
    private String navn;
    private double vægt;
    // link Patient --> 0..* Ordination
    private final List<Ordination> ordinationer = new ArrayList<>();

    public Patient(String cprNr, String navn, double vægt) {
        this.cprNr = cprNr;
        this.navn = navn;
        this.vægt = vægt;
    }

    public double getVægt() {
        return vægt;
    }

    @Override
    public String toString() {
        return navn + "  " + cprNr;
    }
}
