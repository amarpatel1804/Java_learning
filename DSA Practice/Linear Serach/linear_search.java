public class linear_search {
    public static void main(String args[]){

        int A[]={4,20,20,202,20,66,89,9};
        int target=10;
        linearElemnt(A,target);
    }
    public static void linearElemnt(int arr[],int targetEle){

        if(arr.length==0){
            System.out.println("EMPTY ELEMENT");
        }

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==targetEle){
                System.out.println("Element Find At index "+i);
                System.exit(0);
            }

        }
        System.out.println(targetEle+" is not found");



    }
}



