public class test {
    public static void main(String args[])
    {
        int X[]={1,5,4,6,8,7,6};
        int Y[]=new int[2*X.length];

        //FOR RESIZING A ARRAY MAKE NEW REFERENCE B AND B HAS 2X SIZE FROM A...
        //AFTER THAT....A REFERENCE TO B ABD B HAS LARGER SIZE AND CONCLUDE THAT
        //A HAS BIGGER SIZE

        //COPY ALL X ELEMENT TO Y
        for(int i=0;i<X.length;i++){
            Y[i]=X[i];
        }

         Y=null;
        System.out.print("Length of X: "+X.length);
        System.out.print("Length of Y: "+Y.length);
//        for(int l:Y)
//        {
//            System.out.print(l+" ");
//        }

    }
}
