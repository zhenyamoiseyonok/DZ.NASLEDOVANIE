public class Overland extends Transport{
    private int numberOfWheels;
    private double fuelFoul;

    public Overland(int power, int maxSpeed, double weight, String brand, int numberOfWheels, double fuelFoul) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelFoul = fuelFoul;
    }

    @Override
    public void Characteristics() {
        super.Characteristics();
        super.Power();
        System.out.println("Кол-во колес: " + numberOfWheels);
        System.out.println("Расход топлива: " + fuelFoul);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelFoul() {
        return fuelFoul;
    }

    public void setFuelFoul(double fuelFoul) {
        this.fuelFoul = fuelFoul;
    }
}
