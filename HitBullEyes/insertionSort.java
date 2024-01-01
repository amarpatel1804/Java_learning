public class insertionSort {
    public static void main(String[] args) {
        int A[]={4,5,7,8,2,3};

        for(int i=1;i<A.length;i++){
            int temp=A[i];
            int j=i-1;

            while(j>=0 && A[j]>temp){
                A[j+1]=A[j];
                j--;

            }
            A[j+1]=temp;


        }
        for (int x:A) {
            System.out.print(x+" ");
        }

    }
}
