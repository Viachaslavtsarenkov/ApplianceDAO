package by.tc.task01.entity;

public class TabletPC extends Appliance{
    private int flashMemoryCapacity;
    private String color;
    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;

    public TabletPC() {

    }

    public TabletPC(TabletPCBuilder builder) {
        super(builder.price);
        this.flashMemoryCapacity = builder.flashMemoryCapacity;
        this.color = builder.color;
        this.batteryCapacity = builder.batteryCapacity;
        this.displayInches = builder.displayInches;
        this.memoryROM = builder.memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    @Override
    public String toString() {
        return "TABLET PC Flash memory capacity: " + flashMemoryCapacity +
                " Color: " + color +
                " Battery capacity: " + batteryCapacity +
                " Display inches: " + displayInches +
                " Memory ROM: " + memoryROM +
                " Price: " + getPrice() + "\n";
    }

    public static class TabletPCBuilder {

        public int flashMemoryCapacity;
        public String color;
        public double batteryCapacity;
        public double displayInches;
        public int memoryROM;
        public double price;



        public TabletPCBuilder(String[] allDescription) {
            this.batteryCapacity = Double.parseDouble(allDescription[1]);
            this.displayInches = Double.parseDouble(allDescription[3]);
            this.memoryROM = Integer.parseInt(allDescription[5]);
            this.flashMemoryCapacity = Integer.parseInt(allDescription[7]);
            this.color = allDescription[9];
            this.price = Double.parseDouble(allDescription[11]);
        }

        public TabletPC build(){
            return new TabletPC(this);
        }
    }
}
