/*import java.util.Scanner;
class While 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Starting value:");
		int start=s.nextInt();
		System.out.print("Enter your Ending value:");
		int end=s.nextInt();
		
		while (start<=end)
		{
			System.out.println("Santhosh..:)");
			start++;
		}
		System.out.println("\t\tEnd the Value!");
		
	}
}
*/


import java.util.Scanner;
class While
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Starting value:");
		int start=s.nextInt();
		System.out.print("Enter your Ending value:");
		int end=s.nextInt();
		
		while (start<=end)
		{
			if (start%2==0)
			{
				System.out.println(start);
			}
			
		start++;
		}
	}
		
}