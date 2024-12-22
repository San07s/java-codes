import java.util.Scanner;
class addfirstandlast 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number:");
		int number=s.nextInt();
		
		if(number<=9)
		{
			System.out.println("Invalid");
		}
		else
		{
			int last=number%10;
			while(number>9)
			{
				number=number/10;
			}
			int total=number+last;
			System.out.println("Sum of first and Last Number:"+total);
		}
	}
}
