package exerciceprog.java.exercice;

public class Account {
    private static Customer customer ;
    private int idCustomer ;
    private double solde = 0;

    public void Account(Customer customer, int idCustomer, double solde) {
        this.customer = customer;
        this.idCustomer = idCustomer;
        this.solde  = 0.0 ;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getSolde() {
        return solde;
    }

    public String toString() {
        return "Account{" + "customer" + customer + "idCustomer" + idCustomer + "sold" + solde ;
    }

    public void credit( double amount) {
        if ( amount > 0 ) {
         this.solde += amount;
        }
    }
    public void debit ( double amount) {
        if ( this.solde < 0  ) {
            System.out.println("sold not enougth");
        } else {
            this.solde -= amount ;
        }
    }

    public void transferToAccount ( Account target , double amount) {
        if ( this.solde >= amount ) {
            this.solde -= amount ;
            target.credit(amount);
        }else{
            System.out.println("not enougth money in your account");
        }
         
    }


}
