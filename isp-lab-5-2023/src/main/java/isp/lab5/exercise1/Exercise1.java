package isp.lab5.exercise1;
import java.time.LocalDateTime;

public class Exercise1 {

    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Cluj Napoca");
        address.setStreet("21 Decembrie");
        Customer customer = new Customer();
        customer.setCostumerID("1252");
        customer.setName("Peter Pann");
        customer.setPhone("072 n-am cartela");
        customer.setAdress(address);

        Product product = new Product();
        Product.productId = "S23";
        Product.name = "Smartphone";
        Product.price = 1500.0;
        product.productCategory = ProductCategory.ELECTRONICS;
        product.costumer = customer;

        LocalDateTime date = LocalDateTime.now();
        Order order = new Order(product, "671b ", date, product.price);

        System.out.println(order);
    }
}
