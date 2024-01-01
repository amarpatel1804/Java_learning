public class sumOfVariableArgument {
    public static void main(String args[])
    {
        System.out.println("Sum Of All Vararge Numbers: "+sum(1,2,3));
    }

    static int sum(int ...number){

        int sum=0;
        for(int i=0;i<number.length;i++){
            sum=sum+number[i];
        }

        return sum;
    }

}
