package exerciceprog.java.exercice;

public class Main {
    public static void main(String[] args) {
        Product phone = new ELectronics("redmi", 0.1);
        phone.setName("redmi note 8");
        phone.setUnitPrice(200_000);
        System.out.println(((ELectronics) phone).getTTC(0.1));
        Product tablette = new ELectronics("sumsong", 1);
        tablette.setName("tablette");
        tablette.setUnitPrice(1500);
        System.out.println(((ELectronics) tablette).getTTC(1));
        Product akanjo = new Clothing("cotton", "X", "gaucci");
        akanjo.setName("T-shirt");
        akanjo.setUnitPrice(12_200);
        System.out.println(((Clothing) akanjo).getTTC());
        Product malabary = new Clothing("cotton", "L", "XdCloth");
        malabary.setName("malabary");
        malabary.setUnitPrice(75000);
        System.out.println(((Clothing) malabary).getTTC());


        Shop shop = new Shop();
        shop.addProduct(phone);
        shop.addProduct(tablette);
        shop.addProduct(akanjo);
        shop.addProduct(malabary);
        shop.showNamesAndTotalPrices();
    }
}
