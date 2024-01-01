import java.util.stream.StreamSupport;

public class studentChallengeSumOfArrayEle {

    public static void main(String args[])
    {
        int A[]={10,10,10,10,10};
        int sum=0;
        for(int i=0;i<=A.length-1;i++){
            sum=sum+A[i];
        }
        System.out.println("Sum is "+sum);
    }
}
