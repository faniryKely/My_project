import java.util.Objects;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, String description, double unitPrice, String size, String material) {
       super(id, name, description, unitPrice);
        this.size = size;
        this.material = material;
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
    @Override
    public String toString(String name, String description, double unitPrice){
        return this.getName() +"-"+ this.getDescription() +"-"+ this.getUnitPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothing clothing)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(size, clothing.size) && Objects.equals(material, clothing.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, material);
    }

    @Override
    public double getTTC(){
        double priceTTC = 0;
       if(size == "XL" || size == "L" || size == "XXL") {
           priceTTC = this.getUnitPrice() + this.getUnitPrice() * 5 / 100;
       }
       if (this.material.equalsIgnoreCase( "cotton")){
           priceTTC = this.getUnitPrice() + this.getUnitPrice() * 10 / 100;
       }
        return priceTTC;
    }
}
