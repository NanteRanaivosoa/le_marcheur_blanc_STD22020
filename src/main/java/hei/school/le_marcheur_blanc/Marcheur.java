package hei.school.le_marcheur_blanc;

import hei.school.le_marcheur_blanc.emplacement.Lieu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Data
public class Marcheur {
    private String nom;
    private List<Lieu> lieuDejaVisite;
    private Alentours alentour;

    public Marcheur(String nom, Alentours alentour) {
        this.nom = nom;
        this.lieuDejaVisite = new ArrayList<>();
        this.alentour = alentour;
    }

    public List<Lieu> marcher(Lieu depart, Lieu arrive){
        Random random = new Random();
        while (!depart.equals(arrive)){
            Map<Lieu, List<Lieu>> lieuxAccessiblesMap = alentour.getLieuxAccessibles();
            List<Lieu> lieuxDispo = lieuxAccessiblesMap.getOrDefault(depart, new ArrayList<>());

            Lieu choixSuivant = lieuxDispo.isEmpty()? depart : lieuxDispo.get(random.nextInt(lieuxDispo.size()));

            depart = choixSuivant;
            lieuDejaVisite.add(depart);
        }
        return lieuDejaVisite;
    }
}
