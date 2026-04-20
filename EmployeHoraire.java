import exeptionss.InvalidWorkDataException;

public class EmployeHoraire extends Employe{
    int tauxHoraire;
    int heuresTravaillees;
    void getHoraire(int tauxHoraire,int heuresTravaillees) throws InvalidWorkDataException {
        if (heuresTravaillees > 240){
            throw new InvalidWorkDataException("checked exception");
        }
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;

    }

    @Override
    int getAnciennete() {
        return 0;
    }

    @Override
    public double calculerSalaireBrut() {
        return 0;
    }

    @Override
    public double calculerPrimeAnciennete() {
        return 0;
    }

    @Override
    public double calculerNetAPayer() {
        return 0;
    }
}
