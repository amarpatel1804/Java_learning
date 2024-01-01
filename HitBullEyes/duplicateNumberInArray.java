import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateNumberInArray {
    public static void main(String[] args) {
        int arr[]={10,15,22,4,2,5,55,66,222,22,11,15,10,3};

        Set<Integer> duIntegers=new HashSet<>();
        for (int number:arr) {
            if (!duIntegers.add(number)){
                System.out.println("Duplicate number found: "+number);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
