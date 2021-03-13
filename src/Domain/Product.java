package Domain;

import java.util.ArrayList;

public class Product {

    String naam;
    Double prijs;
    Double gewicht;
    Integer stock;
    Boolean inStock;
    ArrayList producten;

    ArrayList<ProductKeuze> productKeuzes;

    public ArrayList keuzeProducten() {

        return productKeuzes;
    }


    public void krijgGewicht() {
    }

    public void krijgPrijs() {
    }

    public void veranderInStock() {
    }

    public void krijgInStock() {
    }
}

