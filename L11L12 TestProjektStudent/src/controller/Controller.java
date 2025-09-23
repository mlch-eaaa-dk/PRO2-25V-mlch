package controller;

import ordination.*;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NullMarked
public abstract class Controller {
    private static Storage storage = new Storage();

    public static Storage getStorage() {
        return storage;
    }

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    /**
     * Opret og returner en PN ordination.
     * Hvis startDato er efter slutDato, kastes en IllegalArgumentException.
     * Pre: antal > 0.
     */
    public static PN opretPNOrdination(
        LocalDate startDato, LocalDate slutDato, double antal,
        Patient patient, @Nullable Lægemiddel lægemiddel
    ) {
        // TODO
        return new PN();
    }

    /**
     * Opret og returner en DagligFast ordination.
     * Hvis startDato er efter slutDato, kastes en IllegalArgumentException.
     * Pre: morgenAntal, middagAntal, aftenAntal, natAntal er alle >= 0.
     */
    public static DagligFast opretDagligFastOrdination(
        LocalDate startDato, LocalDate slutDato,
        double morgenAntal, double middagAntal, double aftenAntal, double natAntal,
        Patient patient, @Nullable Lægemiddel lægemiddel
    ) {
        // TODO
        return new DagligFast();
    }

    /**
     * Opret og returner en DagligSkæv ordination.
     * Hvis startDato er efter slutDato, kastes en IllegalArgumentException.
     * Hvis antallet af elementer i klokkeSlet og antalEnheder er forskellige,
     * kastes en IllegalArgumentException.
     * Pre: I antalEnheder er alle tal >= 0.
     */
    public static DagligSkæv opretDagligSkævOrdination(
        LocalDate startDen, LocalDate slutDen, LocalTime[] klokkeSlet, double[] antalEnheder,
        Patient patient, @Nullable Lægemiddel lægemiddel
    ) {
        // TODO
        return new DagligSkæv();
    }

    /**
     * Tilføj en dato for anvendelse af PN ordinationen.
     * Hvis datoen ikke er indenfor ordinationens gyldighedsperiode,
     * kastes en IllegalArgumentException.
     */
    public static void anvendOrdinationPN(PN ordination, LocalDate dato) {
        // TODO
    }

    /**
     * Returner den anbefalede dosis pr. døgn til patienten af lægemidlet.
     * (Den anbefalede dosis afhænger af patientens vægt.)
     */
    public static double anbefaletDosisPrDøgn(Patient patient, Lægemiddel lægemiddel) {
        // TODO
        return 0;
    }

    /** Returner antal ordinationer af lægemidlet for patienter med vægt i vægtintervallet. */
    public static int antalOrdinationerPrVægtPrLægemiddel(
        double vægtStart, double vægtSlut, Lægemiddel lægemiddel
    ) {
        // TODO
        return 0;
    }

    public static List<Patient> getAllePatienter() {
        return storage.getAllPatienter();
    }

    public static List<Lægemiddel> getAlleLægemidler() {
        return storage.getAllLægemidler();
    }

    public static Patient opretPatient(String cpr, String navn, double vægt) {
        Patient p = new Patient(cpr, navn, vægt);
        storage.storePatient(p);
        return p;
    }

    public static Lægemiddel opretLægemiddel(
        String navn, String enhed,
        double enhedPrKgPrDøgnLet, double enhedPrKgPrDøgnNormal, double enhedPrKgPrDøgnTung
    ) {
        Lægemiddel lm = new Lægemiddel(
            navn, enhed, enhedPrKgPrDøgnLet, enhedPrKgPrDøgnNormal, enhedPrKgPrDøgnTung
        );
        storage.storeLægemiddel(lm);
        return lm;
    }

    public static void initStorage() {
        Patient jane = opretPatient("121256-0512", "Jane Jensen", 63.4);
        Patient finn = opretPatient("070985-1153", "Finn Madsen", 83.2);
        opretPatient("050972-1233", "Hans Jørgensen", 89.4);
        opretPatient("011064-1522", "Ulla Nielsen", 59.9);
        Patient ib = opretPatient("090149-2529", "Ib Hansen", 87.7);

        Lægemiddel acetylsalicylsyre = opretLægemiddel(
            "Acetylsalicylsyre", "styk", 0.1, 0.15, 0.16
        );
        Lægemiddel paracetamol = opretLægemiddel(
            "Paracetamol", "mL", 1, 1.5, 2);
        Lægemiddel fucidin = opretLægemiddel(
            "Fucidin", "styk", 0.025, 0.025, 0.025
        );
        opretLægemiddel(
            "Methotrexate", "styk", 0.01, 0.015, 0.02
        );

        opretPNOrdination(
            LocalDate.parse("2025-09-01"), LocalDate.parse("2025-09-12"), 123,
            jane, paracetamol
        );
        opretPNOrdination(LocalDate.parse("2025-09-12"), LocalDate.parse("2025-09-14"), 3,
            jane, acetylsalicylsyre
        );
        opretPNOrdination(LocalDate.parse("2025-09-20"), LocalDate.parse("2025-09-25"), 5,
            ib, fucidin
        );
        opretPNOrdination(LocalDate.parse("2025-09-01"), LocalDate.parse("2025-09-12"), 123,
            jane, paracetamol
        );

        opretDagligFastOrdination(
            LocalDate.parse("2025-09-10"), LocalDate.parse("2025-09-12"), 2, 0, 1, 0,
            finn, fucidin
        );

        LocalTime[] kl = {
            LocalTime.parse("12:00"), LocalTime.parse("12:40"),
            LocalTime.parse("16:00"), LocalTime.parse("18:45")};
        double[] an = {0.5, 1, 2.5, 3};
        opretDagligSkævOrdination(
            LocalDate.parse("2025-09-23"), LocalDate.parse("2025-09-24"), kl, an,
            finn, fucidin
        );
    }
}
