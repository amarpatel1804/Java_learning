class Cylinder{

    //Properties of cylinder class
    public double radius;
    public double height;

    //Behaviour of rectangle class

    double lidArea(){
        return Math.PI*radius*radius;
    }

    double totalAreaSurface(){
        return 2*lidArea()+circlefence()*height;
    }
    double circlefence(){
        return 2*Math.PI*radius;
    }

    double volume()
    {
        return height*lidArea();
    }
}

public class cylinderTest {

    public static void main(String args[])
    {
        Cylinder c=new Cylinder();
        c.height=10;
        c.radius=5;

        System.out.println("Lid area: "+Math.round(c.lidArea()));
        System.out.println("Total Area: "+Math.round(c.totalAreaSurface()));
        System.out.println("Volume "+Math.round(c.volume()));
    }

}

