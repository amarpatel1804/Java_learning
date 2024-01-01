import java.util.Scanner;

public class kodyTechnoTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        float ans=a+b;

        System.out.println("Sum of "+a+" and "+b+" "+ans);
    }
}
