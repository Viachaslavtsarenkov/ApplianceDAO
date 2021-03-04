package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wantType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(VacuumCleanerBuilder builder) {
        super(builder.price);
        this.powerConsumption = builder.powerConsumption;
        this.filterType = builder.filterType;
        this.bagType = builder.bagType;
        this.wantType = builder.wantType;
        this.motorSpeedRegulation = builder.motorSpeedRegulation;
        this.cleaningWidth = builder.cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWantType() {
        return wantType;
    }

    public void setWantType(String wantType) {
        this.wantType = wantType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VACUUM CLEANER Power consumption: " + powerConsumption +
                " Filter type: " + filterType +
                " Bag type: " + bagType +
                " Want type: " + wantType +
                " Motor speed regulation: " + motorSpeedRegulation +
                " Cleaning width: " + cleaningWidth +
                " Price: " + getPrice() + "\n";
    }

    public static class VacuumCleanerBuilder {
        public int powerConsumption;
        public String filterType;
        public String bagType;
        public String wantType;
        public int motorSpeedRegulation;
        public int cleaningWidth;
        public double price;

        public VacuumCleanerBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.filterType = allDescription[3];
            this.bagType = allDescription[5];
            this.wantType = allDescription[7];
            this.motorSpeedRegulation = Integer.parseInt(allDescription[9]);
            this.cleaningWidth = Integer.parseInt(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public VacuumCleaner build() {
            return new VacuumCleaner(this);
        }

    }
}
