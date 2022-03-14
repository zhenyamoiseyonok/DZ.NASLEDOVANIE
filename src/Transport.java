public class Transport {
    private int power;
    private int maxSpeed;
    private double weight;
    private String brand;

    public Transport(int power, int maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public void Characteristics() {
        System.out.println("Мощность: "+ power);
        System.out.println("Макс. скорость: " + maxSpeed);
        System.out.println("Масса: " + weight);
        System.out.println("Марка: "+ brand);
    }
    public void Power( ) {
        System.out.println("Мощность в кВ: " + (power* 0.74));
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
