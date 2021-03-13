package Domain;

import java.util.ArrayList;

public class Chauffeur {

    String voornaam;
    String achternaam;
    String rijbewijs;
    String telefoonnummer;
    ArrayList<Planning> planning;
    Vrachtwagen vrachtwagen;
    ArrayList<Uurrooster> uurroosters;

    public String krijgNaam(String naam) {

        naam = voornaam + " " + achternaam;
        return naam;
    }

    public ArrayList plannen() {

        return planning;
    }

    public Vrachtwagen vrachtwagenChauffeur() {

        return vrachtwagen;
    }

    public ArrayList chauffeurUurrooster() {
        return uurroosters;
    }

    public void krijgTelefoonnummer() {
    }

    public void startRonde(Boolean start) {
    }

    public void stopRonde(Boolean stop) {
    }
}
