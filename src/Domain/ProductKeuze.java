package Domain;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductKeuze {
    String keuze;
    Integer aantal;


    public ProductKeuze() {


    }

    public void keuzeProduct(){

        String switchCase;

        Scanner keuze = new Scanner(System.in);

        System.out.println("Gelieve te kiezen tussen: a. Ophalen b. leveren c. Ophalen/leveren ");

        switchCase = keuze.nextLine();

        switch (switchCase){
            case "a": System.out.println("U hebt voor Ophalen gekozen");
                break;
            case "b": System.out.println("U hebt voor leveren gekozen");
                break;
            case "c": System.out.println("U hebt voor beiden gekozen");
                break;
        }

    }


    public void voegProductKeuzeToe() {

    }

    public void veranderAantal() {
    }

    public void verwijderProductKeuze() {
    }

}
