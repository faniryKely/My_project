public class Main {
    public static void main(String[] args) {
        Product phone = new Electronic(1, "redmi note 8", "qsdfm", 300_000, "mi", 1.2);
     ((Electronic) phone).getTTC(1.2);
        Product malabary = new Clothing(1, "malabary", "vetement traditionnel malagasy", 75_700, "L", "cotton");
       malabary.getTTC();
        Product pc = new Electronic(3,
                "Dell Precision 5503",
                "Core i9 8th gen. 16Gb"
                        +" of RAM. Nvidia Graphics 1050Ti and Intel Graphics",
                4_000_000,
                "DELL", 3);
        Product pcDuplicate = new Electronic(3,
                "Dell Precision 5503",
              "Core i9 8th gen. 16Gb of RAM. Nvidia Graphics 1050Ti and Intel Graphics", 4_000_000,"DELL", 3);

        Shop Shope = new Shop();
        Shope.addProduct(phone);
        Shope.addProduct(malabary);
        Shope.addProduct(pc);
        Shope.addProduct(pcDuplicate);
//        Shope.displayProduct();
        Shope.showNamesAndTotalPrices();
        System.out.println(pc.equals(pcDuplicate));

    }

}