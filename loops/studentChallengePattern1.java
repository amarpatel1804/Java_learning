public class studentChallengePattern1 {

    //TASK10: Pattern1 Printing
    public static void main(String args[]){

        //i is act asa a row element
//        for(int i=1;i<=5;i++)
//        {
//            //here j is act as a colomn elemnt
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        for(int i=1;i<=5;i++)
//        {
//            //here j is act as a colomn elemnt
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=5;i++)
//        {
//            //here j is act as a colomn elemnt
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print((i+j)+" ");
//            }
//            System.out.println();
//        }

        int count=0;
        for(int i=1;i<=5;i++)
        {
            //here j is act as a colomn elemnt
            for(int j=1;j<=5;j++)
            {
                System.out.format("%02d ",(++count));
            }
            System.out.println();
        }
    }

}
