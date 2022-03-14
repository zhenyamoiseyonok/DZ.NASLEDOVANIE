public class Military extends Overhand {
    private boolean systemOfBailout;
    private int numberOffRocket;

    public Military(int power, int maxSpeed, double weight, String brand, double wingspan, double minRunwayLength, boolean systemOfBailout, int numberOffRocket) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.systemOfBailout = systemOfBailout;
        this.numberOffRocket = numberOffRocket;
    }

    public void fire () {
        if (numberOffRocket != 0) {
            System.out.println("Ракета пошла!");
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void catapult () {
        if (systemOfBailout == true) {
            System.out.println("Катапультирование прошло успешно!");
        }
        else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public void Characteristics() {
        super.Characteristics();
        System.out.println("Есть система катапульт. : " + systemOfBailout);
        System.out.println("Кол-во ракет:  " + numberOffRocket);
    }

    public boolean isSystemOfBailout() {
        return systemOfBailout;
    }

    public void setSystemOfBailout(boolean systemOfBailout) {
        this.systemOfBailout = systemOfBailout;
    }

    public int getNumberOffRocket() {
        return numberOffRocket;
    }

    public void setNumberOffRocket(int numberOffRocket) {
        this.numberOffRocket = numberOffRocket;
    }
}
