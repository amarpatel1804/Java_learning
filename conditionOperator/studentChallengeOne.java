import java.util.*;
public class studentChallengeOne {

    public static void main(String args[])
    {
        //Find a number is odd or even
        int number;
        System.out.println("Enter a number for checking whather is it odd or even: ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();

        if(number%2==0)
        {
            System.out.println("Given number "+number+" is even number");
        }
        else {
            System.out.println("Given number "+number+" is odd number");
        }


        //Find person young or not
        System.out.println("Enter person age: ");
        int age=sc.nextInt();

        if(age>=14 && age<=55)
        {
            System.out.println("Person is young");
        } else if (age<14 && age>55) {
            System.out.println("Person is not young");
        }

        //Find grade for given marks
        System.out.println("Enter your three subject marks: ");
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        int total=m1+m2+m3;
        int avg=total/3;

        if(avg>=70){
            System.out.println("Grade A");
        } else if (avg>=60 && avg<70) {
            System.out.println("Grade B");
        } else if (avg>=50 && avg<60) {
            System.out.println("Grade C");
        } else if (avg>=40 && avg<50) {
            System.out.println("Grade D");
        } else if (avg<40) {
            System.out.println("Grade E");
        }
    }

}
