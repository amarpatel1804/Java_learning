import java.util.*;
public class maxProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={5,40,4,5,7,8};
        int max=0;

        for (int i=0;i<A.length-1;i++){

            if (A[i]>max){
                max=A[i];
            }
        }
        System.out.println("MAX VALUE IS "+max);

    }
}
