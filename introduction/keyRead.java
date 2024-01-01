import java.util.*;
import java.lang.*;

class keyRead
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println(c);

		String extra=s.nextLine();
		
		System.out.println("May I know your name:  ");
		String name=s.nextLine();
		System.out.println("Welcome dear "+ name);
	}

}