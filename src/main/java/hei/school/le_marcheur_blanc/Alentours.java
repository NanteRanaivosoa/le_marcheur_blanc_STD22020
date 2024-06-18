package hei.school.le_marcheur_blanc;


import hei.school.le_marcheur_blanc.emplacement.Lieu;
import hei.school.le_marcheur_blanc.emplacement.Rue;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.List;
import java.util.Map;
@Getter
@AllArgsConstructor
public class Alentours {
    private Lieu lieu1;
    private Lieu lieu2;
    private List<Rue> rues;
    private Map<Lieu, List<Lieu>> lieuxAccessibles;

    public Alentours(Map<Lieu, List<Lieu>> lieuxAccessibles) {
        this.lieuxAccessibles = lieuxAccessibles;
    }

}
