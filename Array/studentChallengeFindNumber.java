public class studentChallengeFindNumber {

    public static void main(String args[])
    {
        int A[]={10,20,4,50,4,1,3,6,8};
        int key=6;
        for(int i=0;i<=A.length-1;i++){
            if(key==A[i]){
                System.out.println("Key is found on "+i);
                System.exit(0);
            }
        }

        System.out.println("Key is not found");
    }

}
