public class rotatingArray {

    public static void main(String args[])
    {
        int A[]={10,12,54,12,4,5,6};
        int temp=A[0];

        //rotating 1 element in left side or leftshift
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }

        A[A.length-1]=temp;
        System.out.print("Left shift: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }


System.out.println();

        //RIGHT ROTATION IN AN ARRAY
        int B[]={1,4,8,7,8,6,4,5};
        int lastTemp=B[B.length-1];

        for(int i=B.length-2;i>=0;i--){
            B[i+1]=B[i];
        }
        B[0]=lastTemp;

        System.out.print("Right shift: ");

        for(int x:B)
        {
            System.out.print(x+" ");
        }
    }

}
