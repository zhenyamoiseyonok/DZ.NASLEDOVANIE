public class MainAutomobile {
    public static void main(String[] args) {
        Overland overland = new Overland(20,100,32,"BMW",6,5.5);
        overland.Characteristics();
        System.out.println("-------------------------");
        Automobile auto = new Automobile(2,200,25.5,"LADA",6,5.6,"Sedan", 55);
        auto.Characteristics();
        System.out.println();
        System.out.println("++++++++++++");
        Freight truck = new Freight(2,60,120,"GMC",9,5.5,300);
        truck.Characteristics();
        truck.loadingCargo();

        System.out.println("++++++++++++++++++");

        Civil plane = new Civil(100,1000,500.54,"Boeng",300,600,50,false);
        plane.Characteristics();
        plane.loadingPeople();
        System.out.println("++++++++++++++++++");
        Military sy17 = new Military(1000,2500,500,"Sy",55.5,555,true,0);
        sy17.Characteristics();
        sy17.fire();
        sy17.catapult();
    }
}
