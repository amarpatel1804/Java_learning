public class sumOfTwoDimentionalArray {
    public static void main(String args[]){
        int A[][]={{1,2,4,5,3},{5,7,8,6,4},{5,7,8,4,1}};
        int B[][]={{1,4,5,7,8},{5,8,9,8,7},{5,4,7,8,6}};
        int C[][]=new int[5][5];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++){
                C[i][j]=A[i][j]+A[i][j];
//                System.out.print(C[i][j]+" ");
            }
//            System.out.println();
        }

        for(int x[]:C)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
