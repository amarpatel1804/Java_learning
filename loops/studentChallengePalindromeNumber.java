import java.util.Scanner;

public class studentChallengePalindromeNumber {
    public static void main(String args[])
    {
        //TASK5: Number is palindrome or not
        System.out.println("Enter A Number(PALINDROME): ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int m=number;
        int r=0,reverse=0;

        while(number!=0){
            r=number%10;
            reverse=reverse*10+r;
            number=number/10;
        }

        //Checking for palindrome Number or not
        if(m==reverse){
            System.out.println(reverse+" Number is a palindrome");
        }
        else {
            System.out.println(reverse+" Number is not a palindrome");
        }
    }

}
