import java.util.Scanner;

public class Freight extends Overland{
    private double tonnage;

    public Freight(int power, int maxSpeed, double weight, String brand, int numberOfWheels, double fuelFoul, double tonnage) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelFoul);
        this.tonnage = tonnage;
    }

    @Override
    public void Characteristics() {
        super.Characteristics();
        System.out.println("Грузоподъемность: " + tonnage);
    }
    public void loadingCargo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес груза,который хотите поместить в грузовик: ");
        double weight = scanner.nextDouble();
        if (weight <= tonnage) {
            System.out.println("Грузовик загружен!");
        }
        else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
}
