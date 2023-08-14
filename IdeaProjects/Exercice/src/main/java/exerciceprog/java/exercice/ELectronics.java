package exerciceprog.java.exercice;


public class ELectronics extends Product {

    private String brand;
    private double weigthInKg ;

    private ELectronics(String brand, double weigthInKg) {
        this.brand = brand;
        this.weigthInKg = weigthInKg;
    }

    public double getWeigthInKg() {
        return this.weigthInKg;
    }

    public void setWeigthInKg(double weigthInKg) {
        this.weigthInKg = weigthInKg;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.getBrand() + "-" + this.getName() + "-" + this.getWeigthInKg();
    }


    public double getTTC (double weigth) {
        double priceTTC = 0;
        return priceTTC = this.getUnitPrice() + 15_000  * weigth;
    }


    @Override
    public double getTTC() {
        return getTTC(getWeigthInKg());
    }
}



