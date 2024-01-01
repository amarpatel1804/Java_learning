class circle{

    //Properties Of class
    public double radius;

    //Behaviour or method of class
    double area(){
        return Math.PI*radius*radius;
    }

    double parameter(){
        return 2*Math.PI*radius;
    }

    double geofence()
    {
        return parameter();
    }

}

public class circleClass {

    public static void main(String args[]){

        circle c=new circle();
        c.radius=10;
        System.out.println("Area of 10 meter radius circle is: "+c.area());
        System.out.println("Parameter of 10 meter radius circle is: "+c.parameter());
        System.out.println("Geofence of 10 meter radius circle is: "+c.geofence());

        circle c1=new circle();
        c1.radius=4;
        System.out.println("Area of 10 meter radius circle is: "+c1.area());
        System.out.println("Parameter of 10 meter radius circle is: "+c1.parameter());
        System.out.println("Geofence of 10 meter radius circle is: "+c1.geofence());
    }


}
