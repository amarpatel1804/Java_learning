public class insertingElementInArray {
    public static void main(String srgs[]){
        int A[]=new int[10];
        A[0]=2;
        A[1]=8;
        A[2]=9;
        A[3]=2;
        A[4]=3;
        A[5]=6;

        int index=3;
        int x=44;

        for(int i=A.length-1;i>index;i--){
            A[i]=A[i-1];
        }

        A[index]=x;

        for(int a:A){
            System.out.print(a+" ");
        }



        //DELETING ELEMENTS ARRAY
//        int dIndex=2;
//        for(int j=0;j<dIndex;j++){
//            A[j]
//        }
    }
}
