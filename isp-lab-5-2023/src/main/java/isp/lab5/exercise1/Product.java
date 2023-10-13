package isp.lab5.exercise1;
public class Product {
    static String productId;
    static String name;
    static double price;
    ProductCategory productCategory;
    Customer costumer;

    public Customer getCostumer() {
        return costumer;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

}