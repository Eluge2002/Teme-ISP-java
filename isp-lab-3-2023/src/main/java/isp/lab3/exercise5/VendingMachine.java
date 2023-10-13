package isp.lab3.exercise5;

public class VendingMachine {
    private int[][] id;
    private String[] product;
    private int[] value;
    private int credit;

    public void setMenu(int id[], String[] product, int[] value, int credit) {
        this.id = new int[][]{id};
        this.product = product;
        this.value = value;
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (int i = 1; i <= id.length; i++) {
            System.out.println(product[i] + "  $" + value[i]);
            System.out.println(id[i]);
        }
    }

    public void insertCoin(int value) {
        this.credit += value;

    }

    public String selectProduct(int id) {

        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i][0] == id) {
                if (this.credit >= this.value[i]) {
                    return ("Dispensing" + this.product[i]);
                    this.credit -= this.value;
                } else {
                    return "Not enough money";
                }
            }
        }
        return "Invalid selection";
    }
public void displayCredit(){
    System.out.println("Current credit:"+credit);
}
    public void displayMenu() {

    }

    public void userMenu() {

    }
    public static void main(String[] args) {

    }


}