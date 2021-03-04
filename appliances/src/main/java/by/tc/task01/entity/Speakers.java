package by.tc.task01.entity;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;


    public Speakers() {

    }

    public Speakers(SpeakersBuilder builder) {
        super(builder.price);
        this.powerConsumption = builder.powerConsumption;
        this.numberOfSpeakers = builder.numberOfSpeakers;
        this.frequencyRange = builder.frequencyRange;
        this.cordLength = builder.cordLength;
    }

    public int getPowerConsumption() {
        return  powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "SPEAKERS Power consumption:" + powerConsumption +
                " Number of speakers:"  + numberOfSpeakers +
                " Frequency range:" + frequencyRange +
                " Cord length:" + cordLength +
                " Price:" + getPrice() + "\n";
    }

    public  static class SpeakersBuilder {

        public int powerConsumption;
        public int numberOfSpeakers;
        public String frequencyRange;
        public int cordLength;
        public double price;

        public SpeakersBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.numberOfSpeakers = Integer.parseInt(allDescription[3]);
            this.frequencyRange = allDescription[5];
            this.cordLength = Integer.parseInt(allDescription[7]);
            this.price = Double.parseDouble(allDescription[9]);
        }

        public Speakers build() {
            return  new Speakers(this);
        }

    }
}
