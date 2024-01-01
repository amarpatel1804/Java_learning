public class studentChallengePattern2 {

    //TASK11: Pattern Printing
    public static void main(String args[])
    {
        //i represent rows
//        for (int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        int count=0;
//        for (int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print((++count)+" ");
//            }
//            System.out.println();
//        }

//        for (int i=5;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        int count=1;
        for (int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
            }
            ++count;
            System.out.println();
        }

    }

}
