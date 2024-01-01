public class finallyKeyword {
    static void meth1(){
        try {
            System.out.println(10/0);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally is called");
        }
    }
    public static void main(String[] args) {
        meth1();
    }
}
