package hei.school.le_marcheur_blanc;

import hei.school.le_marcheur_blanc.emplacement.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarcheurTest {

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

        Rue rue1 = new Rue(HEI, Pullman, "Andriatsihoarana");
        Rue rue2 = new Rue(Pullman, nexta, "");
        Rue rue3 = new Rue(HEI, sekolintsika, "");
        Rue rue4 = new Rue(sekolintsika, marais, "");
        Rue rue5 = new Rue(HEI, balancoire, "");
        Rue rue6 = new Rue(Pullman, balancoire, "Ranaivo");
        Rue rue7 = new Rue(ESTI, balancoire, "");
        Rue rue8 = new Rue(balancoire, BoulevardDeLEurope, "");
        Rue rue9 = new Rue(BoulevardDeLEurope, ESTI, "");

        List<Rue> rues = new ArrayList<>();
        rues.add(rue1);
        rues.add(rue2);
        rues.add(rue3);
        rues.add(rue4);
        rues.add(rue5);
        rues.add(rue6);
        rues.add(rue7);
        rues.add(rue8);
        rues.add(rue9);

        Map<Lieu, List<Lieu>> alentour = new HashMap<>();
        alentour.put(Pullman, Arrays.asList(HEI, balancoire, nexta));
        alentour.put(HEI, Arrays.asList(Pullman, sekolintsika, balancoire));
        alentour.put(balancoire, Arrays.asList(HEI, Pullman, BoulevardDeLEurope, ESTI));
        alentour.put(sekolintsika, Arrays.asList(HEI, marais));
        alentour.put(marais, Arrays.asList(sekolintsika));
        alentour.put(nexta, Arrays.asList(Pullman));
        alentour.put(BoulevardDeLEurope, Arrays.asList(balancoire, ESTI));
        alentour.put(ESTI, Arrays.asList(BoulevardDeLEurope, balancoire));

        Alentours alentour1 = new Alentours(alentour);

        Marcheur bjarni = new Marcheur("Bjarni", alentour1);

        List<Lieu> lieus = bjarni.marcher(HEI, ESTI);

        assertEquals(ESTI, lieus.getLast());

        System.out.println(lieus);
    }
}
