package exerciceprog.java.exercice;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList = new ArrayList<Product>();


    public void addProduct(Product product) {
        this.productList.add(product);
    }
    public void displayProduct() {
        for (int i = 0; i < this.productList.size(); i++) {
            System.out.println(this.productList.get(i));
        }
    }

    public void showNamesAndTotalPrices () {
        for (int i = 0; i < productList.size(); i++)
            System.out.println((this.productList.get(i).getName() + " : " + ((Product) this.productList.get(i)).getTTC()));
    }
}
//