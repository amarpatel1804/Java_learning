import java.util.Scanner;

public class studentChallengeAirthmeticSeries {

    //TASK7: Display Airthmetic Series
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter difference between two numbers: ");
        int d=sc.nextInt();
        System.out.println("Enter numbers you want to display: ");
        int n=sc.nextInt();
        int temp=a;

        System.out.println(a);
        for(int i=0;i<n;i++){
            temp=temp+d;
            System.out.print(temp+",");
        }
    }
}
