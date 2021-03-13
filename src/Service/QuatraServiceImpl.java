package Service;

import Domain.Afspraak;
import Domain.Klant;
import Domain.Planning;
import Domain.Probleem;

import java.sql.Time;
import java.util.Date;

public class QuatraServiceImpl implements QuatraService {
    public void voegWerkdagToe(Date werkdag, Time uur) {
    }

    public void voegProbleemToe(String probleem) {
    }

    public Planning krijgPlanning(Date datumAfspraak) {
        return null;
    }

    public void veranderGeleverd(Afspraak afspraak, Boolean isGeleverd) {
    }

    public void voegAfspraakToe(Date datumAfspraak, String productKeuze) {
    }

    public void verwijderProductKeuze(String productKeuze) {
    }

    public void verwijderAfspraak(Date afspraak, String productKeuze) {
    }

    public void raadpleegVrijeLeverDatums(Date vrijeDatums) {
    }

    public void krijgUurrooster(Date werkDag, Time uur, Boolean vrij) {
    }

    public Afspraak krijgAfspraak(Date datumAfspraak, String info, Boolean isAfspraakOk) {
        return null;
    }

    public void voegPlanningToe(Date datumPlanning, String planningInfo) {
    }

    public void keurAfspraakGoed(Boolean afspraakOk) {
    }

    public void krijgLaadVermogen(Integer laadVermogen) {
    }

    public Probleem krijgProbleem(String probleem) {
        return null;
    }

    public void voegOplossingToe(String oplossing) {
    }

    public Klant krijgKlantInformatie(String klantInformatie) {
        return null;
    }

    public Afspraak krijgAfspraakInformatie(Date afspraakDatum, String infoAfspraak, Boolean afspraakOk) {
        return null;
    }

    public void bevestigOntvangst(Boolean ontvangen) {

        if (ontvangen == true){


        }


    }

    public void verwijderProbleem(Probleem probleem) {
    }

    public void startRonde(Boolean start) {
    }

    public void stopRonde(Boolean stop) {
    }

    public void verwijderAfspraak(Afspraak afspraak) {
    }
}
