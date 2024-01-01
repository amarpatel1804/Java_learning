public class multipleTryCatch {
    public static void main(String[] args) {
        int A[]={1,5,4,7,9,0};

        try{
            int c=A[0]/A[2];
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println("Bye");

    }
}
