import java.util.Scanner;

public class studentChallengeReverseNumber {
    public static void main(String args[])
    {

        //TASK4: Reverse a Number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number(REVERSE): ");
        int n=sc.nextInt();
        int reverse=0;
        int r=0;

        while(n!=0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.println("Reverse Number is "+reverse);
    }
}
