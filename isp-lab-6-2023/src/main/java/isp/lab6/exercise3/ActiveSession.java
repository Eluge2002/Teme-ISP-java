package isp.lab6.exercise3;

import java.util.Map;


public class ActiveSession {
    private String username;
    private Map shoppingcart;
    ActiveSession(String username){
        this.username=username;
    }

    public void addToCart(Product product, int quantity) {
        shoppingcart.put(product,quantity);
        System.out.println("product :" + product + " quantity: " + quantity);
    }
}