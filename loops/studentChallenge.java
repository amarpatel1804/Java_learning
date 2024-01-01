import java.util.Scanner;

public class studentChallenge {
    public static void main(String args[]){

        //TASK1: Display digits of Numbers
        System.out.println("Enter a Number(DIGITS)");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int r;
        System.out.println("Digits are: ");

        while (number!=0){
            r=number%10;
            number=number/10;
            System.out.println(r);
        }

        //TASK2: Count Digits of a Number
        System.out.println("Enter a Number(DIGIT COUNT): ");
        int Number=sc.nextInt();
        int count=0;

        while (Number!=0){
            Number=Number/10;
            count++;
        }
        System.out.println("Total Digits of Number are "+count);

    }
}
