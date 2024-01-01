import java.util.*;

public class studentchallange {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Base of triangle: ");
        float base=s.nextFloat();
        System.out.println("Enter Height of triangle: ");
        float height=s.nextFloat();

        float area=(base*height)/2;

        System.out.println("Area of a Triangle is "+area);


        //second qeestion
        System.out.println("Enter side of a triangle: ");
        System.out.println("x: ");
        float x=s.nextFloat();
        System.out.println("y: ");
        float y=s.nextFloat();
        System.out.println("z: ");
        float z=s.nextFloat();

        float p=(x+y+z)/2;

        float areaOfTriangle=(float)Math.sqrt(p*(p-x)*(p-y)*(p-z));

        System.out.println("Area of Triangle using their sides "+areaOfTriangle);

    }
}
