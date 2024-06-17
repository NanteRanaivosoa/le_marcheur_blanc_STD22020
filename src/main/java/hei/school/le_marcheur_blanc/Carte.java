package hei.school.le_marcheur_blanc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Carte {
    private List<Lieu> lieux;
    private List<Rue> rues;

    public List<Rue> savoirLesRuesDisponibles(Lieu lieu) {
        List<Rue> rueListe = new ArrayList<>();
        for (Rue rue : this.rues) {
            if (lieu.equals(rue.getLieu1()) || lieu.equals(rue.getLieu2())) {
                rueListe.add(rue);
            }
        }
        return rueListe;
    }
}
