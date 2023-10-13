package isp.lab5.exercise1;
public class Customer {
    private String costumerID;
    private Address adress;
    private String phone;public Address getAddress() {
        return adress;
    }
    private String name;

    public void setCostumerID(String costumerID) {
        this.costumerID = costumerID;
    }
    public String getCostumerID() {
        return costumerID;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
}