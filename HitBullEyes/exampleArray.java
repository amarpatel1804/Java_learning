import java.util.Scanner;

public class exampleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];

        for(int i=0;i<=6
                    ;i++){
            A[i]=sc.nextInt();
        }

        for (int i=0;i<=A.length-1;i++){
            System.out.println(A[i]);
        }
    }
}
