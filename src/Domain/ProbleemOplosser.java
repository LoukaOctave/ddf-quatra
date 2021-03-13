package Domain;

import java.util.ArrayList;

public class ProbleemOplosser {

    String voornaam;
    String achternaam;
    String telefoonnummer;


    ArrayList<Probleem> probleem;

    public String krijgNaam(String naam) {

        naam = voornaam + " " + achternaam;
        return naam;
    }

    public ArrayList getProblemen() {

        return probleem;
    }

    public void krijgTelefoonnummer() {
    }

    public void bevestigOntvangst(Boolean ontvangen) {
    }

    public void analyseerProbleem() {
    }
}
