package hei.school.le_marcheur_blanc;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@NoArgsConstructor
public class Bjarni {
    private String nom;
    private List<Lieu> lieuDejaVisite;
    private Carte carte;

    public Bjarni(String nom, Carte carte) {
        this.nom = nom;
        this.carte = carte;
        this.lieuDejaVisite = new ArrayList<>();
    }

    public List<Lieu> marcher(Lieu depart, Lieu arrive){
        Random random = new Random();
        do{
            List<Rue> rueDispo = carte.savoirLesRuesDisponibles(depart);
            Rue choisirUneRue = rueDispo.get(random.nextInt(rueDispo.size()));
            depart = choisirUneRue.savoirLeLieuAuBoutDeLaRue(depart);
            lieuDejaVisite.add(depart);
        }while (!depart.equals(arrive));
        return lieuDejaVisite;
    }
}
