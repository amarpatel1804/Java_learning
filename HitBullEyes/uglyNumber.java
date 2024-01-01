import java.util.Scanner;

public class uglyNumber {
    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        while(no>1){
            if(no%2==0){
                no=no/2;
            }
            else if(no%3==0){
                no=no/3;
            }
            else if(no%5==0){
                no=no/5;
            }
            else {
                System.out.println(no+" is not a ugly number");
                System.exit(0);
            }
        }

        System.out.println(no+" is A UG,Y NUMBER");
    }
}
