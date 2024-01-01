class car{
    public void startCar(){
        System.out.println("Strat Car");
    }

    public void changeGear(){
        System.out.println("Change Gear Successful");
    }
}

class luxaryCar extends car{

    public void sunRoof(){
        System.out.println("Sunroof Open successful");
    }

    public void changeGear(){
        System.out.println("Atomatic Change Gear System");
    }

}


public class CarExampleMethodOverrinding {
    public static void main(String[] args) {
        car c=new car();
        c.changeGear();

        luxaryCar lc=new luxaryCar();
        lc.changeGear();

        car cm=new luxaryCar();
        cm.changeGear();
    }
}
