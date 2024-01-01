import java.security.KeyPair;
import java.util.Scanner;

public class tryCatchException {
    public static void main(String[] args) {
        int a,b,c;

        System.out.println("Enter Two Numbers: ");
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        try{
            c=a/b;
            System.out.println("Answer is "+c);
        }
        catch (Exception e){
            System.out.println("Number is not divisable by 0, "+e);
        }

        System.out.println("Bye");
    }
}
