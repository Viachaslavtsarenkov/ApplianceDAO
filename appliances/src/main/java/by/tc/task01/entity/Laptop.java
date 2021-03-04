package by.tc.task01.entity;

public class Laptop extends Appliance{
    private String OS;
    private int systemMemory;
    private double CPU;
    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;

    public Laptop() {

    }

    public Laptop(LaptopBuilder builder) {
        super(builder.price);
        this.OS = builder.OS;
        this.systemMemory = builder.systemMemory;
        this.CPU = builder.CPU;
        this.batteryCapacity = builder.batteryCapacity;
        this.displayInches = builder.displayInches;
        this.memoryROM = builder.memoryROM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
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
        return "LAPTOP OS:"+ OS +
                " System memory:" + systemMemory +
                " CPU:" + CPU +
                " Battery capacity:" + batteryCapacity +
                " Display inches:" + displayInches +
                " Memory ROM:" + memoryROM +
                " Price:" + getPrice() + "\n";
    }

    public static class LaptopBuilder {
        public String OS;
        public int systemMemory;
        public double CPU;
        public double batteryCapacity;
        public double displayInches;
        public int memoryROM;
        public double price;

        public LaptopBuilder(String[] allDescription) {
            this.batteryCapacity = Double.parseDouble(allDescription[1]);
            this.OS = allDescription[3];
            this.memoryROM = Integer.parseInt(allDescription[5]);
            this.systemMemory = Integer.parseInt(allDescription[7]);
            this.CPU = Double.parseDouble(allDescription[9]);
            this.displayInches = Double.parseDouble(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public Laptop build() {
            return new Laptop(this);
        }

    }
}
