public class studentChallengeFindMaxNumber {

    public static void main(String args[])
    {
        int A[]={50,4,2,4,7,33,6,6,88};
        int max=A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Maximum Number is "+max);
    }
}
