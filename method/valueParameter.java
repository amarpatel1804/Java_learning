import java.util.Scanner;
public class valueParameter {

    static void max(int x,int y)
    {
        if(x>y)
            System.out.println(y);
        else if(y>x)
            System.out.println(y);
        else
            System.out.println("both are equal");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        max(a,b);

    }

}
