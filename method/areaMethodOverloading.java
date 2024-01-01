public class areaMethodOverloading {

    public static void main(String args[])
    {
        System.out.println("Area of (10*20)rectange: "+area(10,20));
        System.out.println("Area of circle(15 radius): "+area(15));
    }

    static double area(double length,double height)
    {
        return length*height;
    }
    static double area(double radius)
    {
        return (3.14*radius*radius);
    }
}
