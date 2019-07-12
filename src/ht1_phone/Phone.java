package ht1_phone;

public class Phone {

    private String brand;
    private double price;

    public Phone() {}

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice(){
        return price;
    }

    public String toString() {
        return "My phone brand is " +
                this.brand + ", it's cost is " +
                this.price;
    }

}
