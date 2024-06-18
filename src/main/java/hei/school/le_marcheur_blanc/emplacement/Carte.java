package hei.school.le_marcheur_blanc.emplacement;

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
    private Lieu depart;
    private Lieu arrive;
}
