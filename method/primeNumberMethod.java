public class primeNumberMethod {
    public static void main(String args[])
    {
        //Check wheather number is prime or not
        //prime number has only two factors:- 1 and number itself

        boolean x=prime(20);
        if(x==false)
        {
            System.out.println("Number is not prime number");
        }
        else {
            System.out.println("Number is prime number");
        }
    }

    static boolean prime(int n)
    {
        int counter=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                counter++;
        }
        if(counter>=2)
            return false;
        else
            return true;
    }
}
