public class sortingStringArray {
    public static void main(String args[]){
        String arr[]={"java","python","c++","c","ruby","basic"};
        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.print(x+" ");
    }
}
