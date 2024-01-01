public class studentChallengePattern3 {


    //TASK12: Pattern Printing
    //Pattern Printing
    public static void main(String args[])
    {
//        for (int i=5;i>=;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>=6)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
