import java.util.Scanner;

public class studentChallengeAmstrong {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        //TASK3: Find a Amstrong Number or not
        System.out.println("Enter a Numebr(AMSTRONG): ");
        int no=sc.nextInt();
        int comparasionNumber=no;
        int sum=0;
        int r =0 ;

        while (no!=0){
            r=no%10;
            sum=sum+(r*r*r);
            no=no/10;
        }

        if(comparasionNumber==sum)
        {
            System.out.println(comparasionNumber+" is a Amstrong Number");
        }
        else {
            System.out.println(comparasionNumber+" is not a Amstrong Number");
        }
    }
}
