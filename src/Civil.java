import java.util.Scanner;

public class Civil extends Overhand {
    private int numberOffPassgers;
    private boolean businessClass;

    public Civil(int power, int maxSpeed, double weight, String brand, double wingspan, double minRunwayLength, int numberOffPassgers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numberOffPassgers = numberOffPassgers;
        this.businessClass = businessClass;
    }
    public void loadingPeople(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во пасажиров, которых хотите переправить: ");
        int people = scanner.nextInt();
        if (people <= numberOffPassgers) {
            System.out.println("Самолет укомплектован!");
        }
        else {
            System.out.println("Вам нужен самолет побольше!");
        }
    }

    @Override
    public void Characteristics() {
        super.Characteristics();
        System.out.println("Кол-во пасажиров: " + numberOffPassgers);
        System.out.println("Бизнес? " + businessClass);
    }

    public int getNumberOffPassgers() {
        return numberOffPassgers;
    }

    public void setNumberOffPassgers(int numberOffPassgers) {
        this.numberOffPassgers = numberOffPassgers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
