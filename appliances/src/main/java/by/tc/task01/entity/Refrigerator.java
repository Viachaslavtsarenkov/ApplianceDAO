package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    private double freezerCapacity;
    private double overallCapacity;
    private double width;
    private double height;
    private double weight;
    private int powerConsumption;

    public Refrigerator() {

    }
    public Refrigerator(RefrigeratorBuilder builder) {
        super(builder.price);
        this.freezerCapacity = builder.freezerCapacity;
        this. overallCapacity = builder.overallCapacity;
        this.width = builder.width;
        this.height = builder.height;
        this.weight = builder.weight;
        this.powerConsumption = builder.powerConsumption;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
        return "REFRIGERATOR Power consumption: " + powerConsumption +
                " Freezer capacity: " + freezerCapacity +
                " Overall capacity: " + overallCapacity +
                " Width: " + width +
                " Height: " + height +
                " Weight: " + weight +
                " Price: " + getPrice() + "\n";
    }

    public static class RefrigeratorBuilder {
        public double freezerCapacity;
        public double overallCapacity;
        public double width;
        public double height;
        public double weight;
        public int powerConsumption;
        public double price;

        public RefrigeratorBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.weight = Double.parseDouble(allDescription[3]);
            this.freezerCapacity = Double.parseDouble(allDescription[5]);
            this.overallCapacity = Double.parseDouble(allDescription[7]);
            this.width = Double.parseDouble(allDescription[9]);
            this.height = Double.parseDouble(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }
}
