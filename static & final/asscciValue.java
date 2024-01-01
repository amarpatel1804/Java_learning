public class asscciValue {
    public static void main(String[] args) {
        String s="Amarpatel";
        int max=(int)s.charAt(0);
        int min=(int)s.charAt(0);


        for (int i=0;i<s.length();i++){
            int val=(int)s.charAt(i);
            if(val>max){
                max=val;
            }
        }

        for (int j=0;j<s.length();j++){
            int minVal=(int)s.charAt(j);
            if (minVal<min){
                min=minVal;
            }
        }

        System.out.println("Minimum is "+(char)min);
        System.out.println("maximum is: "+(char)max);
    }
}
