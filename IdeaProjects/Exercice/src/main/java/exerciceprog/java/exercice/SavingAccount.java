package exerciceprog.java.exercice;

public class SavingAccount extends Account {
    private double interest ;

    public SavingAccount(Customer customer, int idCustomer, double solde) {
        super(customer, idCustomer, solde);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void applyInterest () {

        double percentAmount = this.getSolde() * interest / 100 ;
        this.credit(percentAmount);
    }
}
