public class oneDimentionArray {
    public static void main(String args[])
    {
        int A[]=new int[5];

        int B[];
        B=new int[5];

        int C[]={10,12,1,54,5,6};

        System.out.println("Using For Loop: ");

        for (int i=0;i<=C.length-1;i++)
        {
            System.out.print(C[i]+" ");
        }

        System.out.println("Using For Each Loop: ");
        for (int x:C)
        {
            System.out.println(x);
        }

    }
}
