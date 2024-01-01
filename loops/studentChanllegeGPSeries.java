import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

//TASK8: GP series
public class studentChanllegeGPSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter a Common ratio: ");
        int r=sc.nextInt();
        System.out.println("Enter a numbers of terms: ");
        int n=sc.nextInt();
        int term=a;
        System.out.print("Gp Series is "+a+",");
        for (int i=0;i<n;i++)
        {
            term=term*r;
            System.out.print(term+",");
        }
    }
}
