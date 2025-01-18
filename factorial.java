import java.util.*;
class factorial
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Find your Factorial Number:");
		int num=s.nextInt();
		
		int n=1;
		
		for (int i=1;i<=num;i++)
		{
			n*=i;
		}
		System.out.println("Your "+num+" factorial is "+n);
	}
}