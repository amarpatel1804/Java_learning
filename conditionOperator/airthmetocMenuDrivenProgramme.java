import java.util.Scanner;

public class airthmetocMenuDrivenProgramme {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("DIV");
        System.out.println("MUL");

        System.out.println("Enter Your choice: ");
        String choice=sc.nextLine();

        System.out.println("Enter 1st Number: ");
        int no1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int no2=sc.nextInt();

        switch (choice){
            case "ADD": System.out.println("Addition is "+(no1+no2));
                        break;
            case "SUB": System.out.println("Substraction is "+(no1-no2));
                        break;
            case "MUL": System.out.println("Multiplication is "+(no1*no2));
                        break;
            case "DIV": System.out.println("Dividation is "+(no1/no2));
                        break;
            default:System.out.println("Invalid Input");
                        break;
        }


    }
}
