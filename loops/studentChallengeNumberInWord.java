import java.util.Scanner;

public class studentChallengeNumberInWord {
    public static void main(String args[]){

        //TASK6: Display Number in Words
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int r=0;
        String str="";

        while(number!=0){
            r=number%10;
            str=str+r;
            number=number/10;
        }

        System.out.println("Reverse String is "+str);

        for(int i=str.length()-1;i>=0;i--)
        {
            switch (str.charAt(i)){
                case '0': System.out.print(" Zero ");
                            break;
                case '1': System.out.print(" One ");
                            break;
                case '2': System.out.print(" Two ");
                            break;
                case '3': System.out.print(" Three ");
                            break;
                case '4': System.out.print(" Four ");
                            break;
                case '5': System.out.print(" Five ");
                            break;
                case '6': System.out.print(" Six ");
                            break;
                case '7': System.out.print(" Seven ");
                            break;
                case '8': System.out.print(" Eight ");
                            break;
                case '9': System.out.print(" Nine ");
                            break;
                default:System.out.println("Invalid Number");
                            break;
            }

        }
    }
}
