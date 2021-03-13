package Domain;

import java.util.ArrayList;

public class Planner {

    String voornaam;
    String achternaam;
    String telefoonnummer;

    ArrayList<Planning> planning;

    public String krijgNaam() {

        String naam = voornaam + " " + achternaam;
        return naam;
    }

    public ArrayList planner() {

        return planning;
    }

    public void krijgTelefoonnummer() {
    }
}
