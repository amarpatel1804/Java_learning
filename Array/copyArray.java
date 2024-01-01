public class copyArray {
    public static void main(String args[])
    {
        int A[]={1,5,6,9,8,7,43,5};
        int B[]=new int[10];

        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }

        for(int x:B){
            System.out.print(x+" ");
        }

        System.out.println();

        //COPYING REVERSE ARRAY
        int P[]={1,5,6,8,7,5,55,6,8,99};
        int Q[]=new int[10];

        for(int i=P.length-1,j=0;i>=0;i--,j++){
            Q[j]=P[i];
        }

        for(int y:Q)
        {
            System.out.print(y+" ");
        }


        System.out.println();
        //INCREASING AN ARRAY SIZE
        int X[]={1,5,4,6,8,7,6};
        int Y[]=new int[10];

        //FOR RESIZING A ARRAY MAKE NEW REFERENCE B AND B HAS 2X SIZE FROM A...
        //AFTER THAT....A REFERENCE TO B ABD B HAS LARGER SIZE AND CONCLUDE THAT
        //A HAS BIGGER SIZE

        //COPY ALL X ELEMENT TO Y
        for(int i=0;i<X.length;i++){
            Y[i]=X[i];
        }

        for(int l:Y)
        {
            System.out.print(l+" ");
        }

        System.out.println("Length of X array: "+X.length);
    }
}
