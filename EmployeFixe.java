import exeptionss.InvalidWorkDataException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeFixe extends Employe{

    double salaire;
    double primePerformance;
    int anciente;
    EmployeFixe(int id, String nom, String email, String departement, LocalDate dateEmbauche){
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.departement = departement;
        this.dateEmbauche = dateEmbauche;
    }
    void getSalairePrime(double salaire,double primePerformance) throws InvalidWorkDataException{
        if(salaire < 3000 ){
            throw new InvalidWorkDataException("checked exception");
        }
        this.salaire = salaire;
        this.primePerformance = primePerformance;
    }
    @Override
     int getAnciennete(){
        return (int) ChronoUnit.YEARS.between(dateEmbauche,LocalDate.now());
    }

    @Override
    public double calculerSalaireBrut() {
        return this.salaire +this.primePerformance;
    }
    public double calculerPrimeAnciennete(){
        anciente = getAnciennete();
        double salaireBrut = calculerSalaireBrut();
        if (anciente < 2)
            {return 0;}
        else if (anciente <= 5)
            {return salaireBrut * 0.05;}
        else {return salaireBrut * 0.10;}
    }
    public double calculerNetAPayer(){
        return (calculerSalaireBrut() + calculerPrimeAnciennete()) - calculerCharges(0.2);
    }
}
