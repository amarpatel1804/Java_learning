import java.util.Scanner;
public class objectParameter {

    //Here we pass object as a parameter so changes in formal parameter reflect in actual parameter because both references reference same object
    static String username(String name)
    {
        int i=name.indexOf('@');
        String username=name.substring(0,i);
        return username;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email Id:");
        String name=sc.nextLine();
        String username=username(name);
        System.out.println("Username of provided email Id is "+username);
    }

}
