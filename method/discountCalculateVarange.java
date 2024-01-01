import java.util.stream.StreamSupport;

public class discountCalculateVarange {
    public static void main(String args[]){
       System.out.println("Discounted payable amount is : "+discount(500,750,20));


    }
    static double discount(int ...price){
        int sum=0;

        for(int i=0;i<price.length;i++)
        {
            sum=sum+price[i];
        }

//        return sum;
        if(sum<500)
            return sum-(sum*0.10);
        else if (sum>=500)
            return sum-(sum*0.20);
        else
            return 0.0;

    }

}
