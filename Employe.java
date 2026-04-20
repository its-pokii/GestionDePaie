import java.time.LocalDate;
import java.util.Date;

public abstract class Employe implements IPaye{

    int id;
    String nom;
    String email;
    String departement;
    LocalDate dateEmbauche;


    abstract int getAnciennete();
}
