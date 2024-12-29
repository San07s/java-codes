import java.util.Scanner;
class palindrome 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		
		while (num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
	    }
		if (rev==temp)
		{
			System.out.println("Your Number Is Palindrome...");
		}
		else 
			System.out.println("Your Number Is not Palindrome...");
			
	}
}
