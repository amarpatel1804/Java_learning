public class commonElementInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int arr1[]={5,10,15,20,25,30,35,40,45};

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
