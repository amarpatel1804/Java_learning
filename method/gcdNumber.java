public class gcdNumber {

    public static void main(String args[])
    {
        int m=10,n=25;
        int x=gcd(m,n);
        System.out.println("GCD of given numbers: "+x);
    }

    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

}
