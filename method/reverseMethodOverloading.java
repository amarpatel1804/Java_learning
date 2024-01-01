import java.util.Arrays;

public class reverseMethodOverloading {
    public static void main(String args[])
    {
        int A[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Reverse Number of 786 is :"+reverse(786));
        System.out.println("Reverse of Array A is: " + Arrays.toString(reverse(A)));
    }
    static int reverse(int number)
    {
        int r=0;
        int reverse=0;

        while (number!=0){
            r=number%10;
            reverse=reverse*10+r;
            number=number/10;
        }
        return reverse;
    }

    static int[] reverse(int A[])
    {

        int B[]=new int[A.length];
        for (int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }

}
