package by.tc.task01.entity;

public class Appliance {
    private double price;

    public Appliance() {

    }

    public Appliance(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Appliance o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
