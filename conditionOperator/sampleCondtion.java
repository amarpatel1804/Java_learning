public class sampleCondtion {

    public static void main(String args[])
    {
        int a=5,b=15,c=4;

        //This called else if ladder
        if(a>b && a>c)
        {
            System.out.println("A is maximum number");
        } else if (b>c) {
            System.out.println("B is maximum number");
        }
        else{
            System.out.println("C is maximum number");
        }
    }

}
