package Domain;


public class appGebruik {

    public static void main(String[] args) {

        Afspraak afspraak = new Afspraak();

        ProductKeuze productKeuze = new ProductKeuze();

        productKeuze.keuzeProduct();

        afspraak.selecteerGewensteDatum();

        afspraak.stuurDoorNaarPlanner();
    }
}
