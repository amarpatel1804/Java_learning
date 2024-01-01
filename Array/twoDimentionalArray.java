public class twoDimentionalArray {
    public static void main(String args[]){
        int A[][]=new int[5][5];
        int C[][];
        C=new int[5][5];

        int []B[]=new int[5][5];

        //Here D is single dimentional report, E is two dimentional array
        int[] D,E[];

        D=new int[5];
        E=new int[5][5];

        int F[][]={{1,5,4,7,8},{5,8,9,7,5},{4,7,8,9,5},{7,8,5,5,6}};

        for(int i=0;i<F.length;i++)
        {
            for (int j=0;j<A[i].length;j++){
                System.out.print(F[i][j]+" ");
            }
            System.out.println();
        }

        for(int X[]:F)
        {
            for(int y:X){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        int X[][]=new int[3][];
        X[0]=new int[3];
        X[1]=new int[5];
        X[2]=new int[2];

        for(int i=0;i<X.length;i++)
        {
            for (int j=0;j<X[i].length;j++)
            {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }


        //USING FOR EACH LOOP
        for(int x[]:X)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }




    }
}
