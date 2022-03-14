public class Overhand extends Transport {
    private double Wingspan;
    private double minRunwayLength;

    public Overhand(int power, int maxSpeed, double weight, String brand, double wingspan, double minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        Wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void Characteristics() {
        super.Characteristics();
        super.Power();
        System.out.println("Размах крыльев: "+ Wingspan);
        System.out.println("Минимальная длина полосы: " + minRunwayLength);
    }

    public double getWingspan() {
        return Wingspan;
    }

    public void setWingspan(double wingspan) {
        Wingspan = wingspan;
    }

    public double getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(double minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}
