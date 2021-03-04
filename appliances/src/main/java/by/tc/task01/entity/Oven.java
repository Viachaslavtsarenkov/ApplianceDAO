package by.tc.task01.entity;

public class Oven extends Appliance{
    private int capacity;
    private int depth;
    private double width;
    private double height;
    private double weight;
    private int powerConsumption;

    public Oven () {

    }

    public Oven (OvenBuilder builder) {
        super(builder.price);
        this.capacity = builder.capacity;
        this.depth = builder.depth;
        this.width = builder.width;
        this.height = builder.height;
        this.weight = builder.weight;
        this.powerConsumption = powerConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return  depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPowerConsumption() {
        return  powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "OVEN Power consumption:" + powerConsumption +
                " Capacity:" + capacity +
                " Depth:" + depth +
                " Width:" + width +
                " Height:" + height +
                " Weight:" + weight +
                " Price:" + getPrice() + "\n";
    }

    public static class OvenBuilder {
        public int capacity;
        public int depth;
        public double width;
        public double height;
        public double weight;
        public int powerConsumption;
        public double price;

        public OvenBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.weight = Double.parseDouble(allDescription[3]);
            this.capacity = Integer.parseInt(allDescription[5]);
            this.depth = Integer.parseInt(allDescription[7]);
            this.height = Double.parseDouble(allDescription[9]);
            this.width = Double.parseDouble(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public Oven build() {
            return new Oven(this);
        }
    }
}
