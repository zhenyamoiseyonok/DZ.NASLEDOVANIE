
public class Automobile extends Overland{
    private String bodyType;
    private int numberOfPassengers;
    private double time=2.5;

    public Automobile(int power, int maxSpeed, double weight, String brand, int numberOfWheels, double fuelFoul, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelFoul);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }
    public double rastoyanie(){
                double rast = time * getMaxSpeed();
                return rast;
    }
    private double rashodFuel() {
    double consumptionFuel = (rastoyanie() * getFuelFoul()) / 100;
        System.out.print("За время "+ time +" ч, "+ "автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed()
                + " км/ч"+ " проедет " + rastoyanie() + " км " + "и израсходует " + consumptionFuel + " л");
        return consumptionFuel;
    }



    @Override
    public void Characteristics() {
        super.Characteristics();
        System.out.println("Тип кузова: " + bodyType );
        System.out.println("Кол-во пасажиров: " + numberOfPassengers );
        rashodFuel();
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
