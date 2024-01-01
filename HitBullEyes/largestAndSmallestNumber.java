public class largestAndSmallestNumber {
    public static void main(String[] args) {
        int arr[]={2,5,4,6,22,55,528,3,1,5555};

        int max=arr[0];
        int min=arr[0];

        for(int number:arr){
            if(max<number){
                max=number;
            }
            else if (min>number){
                min=number;
            }
        }

        System.out.println("Max number is "+max+" Min number is "+min);
    }
}
