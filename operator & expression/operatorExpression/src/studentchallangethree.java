import java.util.Scanner;

public class studentchallangethree {
    public static void main(String args[])
    {
        System.out.println("Enter length,breadth and height: ");
        Scanner s=new Scanner(System.in);
        float length=s.nextFloat();
        float breadth=s.nextFloat();
        float height=s.nextFloat();

        float area=2*(length*breadth+length*height+height*breadth);
        float volume=length*breadth*height;

        System.out.println("Total area is "+area+"\n"+"Total Volume is "+volume);

    }
}
