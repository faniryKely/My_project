import java.util.Objects;

public class Electronic extends Product {

    private String brand;
    private double weightInKg;

    public Electronic(int id, String name, String description, double unitPrice, String brand, double weightInKg) {
        super(id, name, description, unitPrice);
        this.brand = brand;
        this.weightInKg = weightInKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }


    public double getTTC(double weight) {
        double priceTTC = 0;
        priceTTC = this.getUnitPrice() + 15_000 * weight;
        return priceTTC;
    }

    @Override
    public String toString(String name, String description, double unitPrice){
        return this.getName() +"-"+ this.getDescription() +"-"+ this.getUnitPrice();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronic that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.weightInKg, weightInKg) == 0 && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, weightInKg);
    }

    @Override
    public double getTTC() {
        return getTTC(getWeightInKg());
    }
}
