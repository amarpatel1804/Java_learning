import java.util.Scanner;

public class studentChallengeTwo {
    public static void main(String args[])
    {
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        String num= sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Binary Radix");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal Radix");
        } else if (num.matches("[A-F0-9]+")) {
            System.out.println("Hexadecimal Radix");
        } else if (num.matches("[0-9]")) {
            System.out.println("Decimal Radix");
        }else {
            System.out.println("Not a umber");
        }


        //Leaf year
        System.out.println("Enter Year for checking leaf year or not: ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0){
                    System.out.println("Leaf year");
                }
                else{
                    System.out.println("Not a leaf year");
                }
            }
            else{
                System.out.println("Leaf year");
            }
        }
        else {
            System.out.println("Not a leaf year");
        }
    }

}
