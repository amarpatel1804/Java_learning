public class maximumInArrayElement {

    public static void main(String args[]){

        int A[]={1,2,4,5,8,2,4,15};
        System.out.println("Max number in array is "+max(A));

    }

    static int max(int A[])
    {
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
}
