package exerciceprog.java.exercice;

public class Clothing extends Product {
    private String size ;
    private String material;
    private String brand;
    public Clothing(String material, String size, String brand) {
        this.size = size;
        this.material = material;
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.getSize() + "-" + this.getName() + "-" + this.getMaterial();
    }

    public  double getTTC() {
        double priceTTC = 0;
        if (size == "XL" || size == "XXL" || size == "L") {
           priceTTC = this.getUnitPrice() + (this.getUnitPrice() * 5) / 100;
        }
        if (material == "cotton") {
            priceTTC = this.getUnitPrice() + (this.getUnitPrice() * 10) / 100;
        }
        return  priceTTC;
    }
}
