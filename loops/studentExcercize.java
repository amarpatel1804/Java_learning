import java.util.Scanner;

public class studentExcercize {
    public static void main(String args[]){

        //TASK1: Displaying multi[lication table
        int n;
        System.out.println("Enter a Number(TABLE): ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        sc.nextLine();

        //TASK2: Display sum of n numbers
        int sum=0;
        System.out.println("Enter a Number(SUM): ");
        int m=sc.nextInt();
        for (int i=0; i<=m; i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum is "+sum);
        sc.nextLine();

        //TASK3: Factorial Number
        int fact=1;
        System.out.println("Enter a Number(FACTORIAL): ");
        int a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
