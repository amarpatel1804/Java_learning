public class studentChallengeSecondMax {
    public static void main(String args[]){
        int A[]={10,2,5,8,6,8,7,7,77,1};
        int max1=A[0];
        int max2=A[0];

        for (int i=0;i<A.length-1;i++)
        {
            if (A[i]>max1){
                max2=max1;
                max1=A[i];
            }
        }
        System.out.println("Second maximum number: "+max2);
        System.out.println("First maximum number: "+max1);
    }
}
