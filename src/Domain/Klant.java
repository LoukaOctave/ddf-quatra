package Domain;

import java.util.ArrayList;

public class Klant {

    String bedrijfsNaam;
    String adres;
    String email;
    String telefoonnummer;
    ArrayList<Afspraak> afspraken;

    public String getAdres(){

        return adres;
    }

    public String getTelefoonnummer(){

        return telefoonnummer;
    }

    public String getEmail(){
        return email;
    }

    public ArrayList getAfspraken(){

        return afspraken;
    }
}
