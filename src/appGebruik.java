import Domain.Afspraak;
import Domain.ProductkeuzeOld;

public class appGebruik {

    public static void main(String[] args) {

        Afspraak afspraak = new Afspraak();

        ProductkeuzeOld productKeuze = new ProductkeuzeOld();

        productKeuze.keuzeProduct();

        afspraak.selecteerGewensteDatum();

        afspraak.stuurDoorNaarPlanner();
    }
}
