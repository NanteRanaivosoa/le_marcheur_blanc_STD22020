package hei.school.le_marcheur_blanc;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rue {
    private Lieu lieu1;
    private Lieu lieu2;

    public Lieu savoirLeLieuAuBoutDeLaRue(Lieu lieu){
        if (lieu.equals(lieu1)){
            return lieu2;
        }else if (lieu.equals(lieu2)){
            return lieu1;
        }
        return null;
    }
}
