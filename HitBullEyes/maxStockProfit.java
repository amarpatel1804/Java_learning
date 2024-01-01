public class maxStockProfit {
    public static void main(String[] args) {
        int A[]={7,1,5,3,6,4};

        //largest element in array
        //121,344,242,287,75,118

        int min=A[0];
        int maxProfit=0;


        for(int i=0;i<A.length-1;i++){

            min=Math.min(A[i],min);

            int profit=A[i]-min;

            maxProfit=Math.max(profit,maxProfit);

        }
        System.out.println("Maximum Profit Is:"+maxProfit);;
    }
}
