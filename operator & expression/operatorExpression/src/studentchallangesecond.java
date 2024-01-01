import java.util.Scanner;

public class studentchallangesecond {
    public static void main(String args[])
    {
        System.out.println("Enter a,b and c: ");
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();


        double r1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double r2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("Roots are real and there are "+r1+" "+r2);
    }
}
