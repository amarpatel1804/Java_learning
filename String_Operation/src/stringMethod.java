import java.util.Locale;

public class stringMethod {
    public static void main(String args[]){
        String str=" Amar Patel ";

        //Convert all characters to upper case
        String str1=str.toUpperCase();
        System.out.println(str1);

        //Remove wrong spaces
        str=str.trim();
        System.out.println(str);

        //Count the length of stribg
        System.out.println(str.length());

        //Give us substring
        String str2=str.substring(5);
        System.out.println(str2);

        //Give us substring that contains starting and ending index
        String str3=str.substring(5,7);
        System.out.println(str3);


        //Replace method to replace
        String str4=str.replace('a','b');
        System.out.println(str4);


    }
}
