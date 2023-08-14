import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> productLisT = new ArrayList<>();

    public void addProduct(Product product) {
        this.productLisT.add(product);
    }

    public  void displayProduct() {
        for (int i = 0; i < this.productLisT.size(); i++) {
            System.out.println(productLisT.get(i));
        }
    }

    public void showNamesAndTotalPrices(){
        System.out.println("==".repeat(30));
        this.productLisT.forEach(product -> System.out.println(product.getName()  + ":" +  product.getTTC() +"\n"));
        System.out.println("==".repeat(30));
    }
}
