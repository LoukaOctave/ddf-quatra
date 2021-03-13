package Domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Afspraak {

    String gewensteDatum;

    String extraInformatie;

    Boolean goedGekeurd;

    Boolean geleverd;

    String status;

    ArrayList<ProductKeuze> keuzeProduct;

   /* public Afspraak(ArrayList<ProductKeuze> keuzeProduct) {



    }
/*
    public void voegAfspraakToe(String gewensteDatum, String extraInformatie, Boolean goedGekeurd) {

    }
*/
    public void selecteerGewensteDatum(){


        Scanner selectieDatum = new Scanner(System.in);
        System.out.println("Geef gewenste datum");

        gewensteDatum = selectieDatum.nextLine();
        System.out.println("De gewenste datum is dus " + gewensteDatum);

        status = "aangemaakt met datum";
    }


    public void stuurDoorNaarPlanner(){

        if (status == "aangemaakt met datum" ){


            status = "aangevraagd";

        }else{

            System.out.println("Kan niet doorgestuurd worden.");
        }


        System.out.println("De status van uw afspraak is " +status);

    }

    public ArrayList productKeuze() {

        return keuzeProduct;
    }

    public void krijgAfspraak() {
    }

    public void veranderGoedGekeurd() {
    }

    public void verwijderAfspraak(Afspraak afspraak) {
    }
}
