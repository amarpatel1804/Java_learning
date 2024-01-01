import java.util.Scanner;

public class studentChallengeFibonacciSerie {

    //TASK9: Fibonnaci Series
    public static void main(String args[]){
        System.out.println("Enter a numbers of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;

        System.out.print(a+",");
        System.out.print(b+",");
        for (int i=0; i<n;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
