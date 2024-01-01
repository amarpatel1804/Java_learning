public class maxValueVarags {
    public static void main(String args[]){

        System.out.println("Max Number Is: "+max(2,5,8,9,7,55,7,8,999));
        System.out.println("Max Number Is: "+max(2,5,7,88,9,8,99,100));
        System.out.println("Max Number Is: "+max(5,8,99,7,744,7,8,5552));
    }

    static int max(int ...A)
    {
        int max=A[0];
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        else {
            for(int i=0;i<A.length;i++){
                if(A[i]>max){
                    max=A[i];
                }
            }
            return max;
        }
    }
}
