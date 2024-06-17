package hei.school.le_marcheur_blanc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BjarniTest {
    @Test
    void test_Bjarni(){
        Lieu HEI = new Lieu("HEI");
        Lieu Pullman = new Lieu("Pullman");
        Lieu balancoire = new Lieu("balancoire");
        Lieu sekolintsika = new Lieu("sekolintsika");
        Lieu marais = new Lieu("marais");
        Lieu nexta = new Lieu("nexta");
        Lieu BoulevardDeLEurope = new Lieu("BoulevardDeLEurope");
        Lieu ESTI = new Lieu("ESTI");

        Rue rue1 = new Rue(HEI, Pullman);
        Rue rue2 = new Rue(Pullman, nexta);
        Rue rue3 = new Rue(HEI, sekolintsika);
        Rue rue4 = new Rue(sekolintsika, marais);
        Rue rue5 = new Rue(HEI, balancoire);
        Rue rue6 = new Rue(Pullman, balancoire);
        Rue rue7 = new Rue(ESTI, balancoire);
        Rue rue8 = new Rue(balancoire, BoulevardDeLEurope);
        Rue rue9 = new Rue(BoulevardDeLEurope, ESTI);

        List<Lieu> lieux = new ArrayList<>();
        lieux.add(marais);
        lieux.add(sekolintsika);
        lieux.add(HEI);
        lieux.add(balancoire);
        lieux.add(Pullman);
        lieux.add(nexta);
        lieux.add(BoulevardDeLEurope);
        lieux.add(ESTI);

        List<Rue> rues = new ArrayList<>();
        rues.add(rue1);
        rues.add(rue2);
        rues.add(rue3);
        rues.add(rue4);
        rues.add(rue5);
        rues.add(rue6);
        rues.add(rue7);
        rues.add(rue8);

        Carte carte = new Carte(lieux, rues);

        Bjarni bjarni = new Bjarni("Bjarni", carte);

        List<Lieu> lieus = bjarni.marcher(HEI, ESTI);

        assertEquals(ESTI, lieus.getLast());
    }
}
