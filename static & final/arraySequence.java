import java.lang.reflect.Array;

public class arraySequence {
    public static void main(String[] args) {
        int A[] = {25, 5, 95, 65, 47};
        //OP:5,95,25,65,47

        int small = A[0];
        int large = A[1];
        int secondMax=A[1];
        int secondSmall=A[3];


            //for smaller
            for (int i = 0; i < A.length; i++) {
                if (A[i] < small) {

                    secondSmall=small;
                    small = A[i];
                }

            }
            System.out.println(small + " ");


            for (int j = 0; j < A.length; j++) {

                if (A[j] > large) {

                    secondMax=large;
                    large = A[j];

                }
            }

            System.out.println(large + " ");
            System.out.println(secondSmall+" ");
            System.out.println(secondMax+" ");
        }
    }

