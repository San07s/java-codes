import java.util.Scanner;
class digitcount 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		int count=0;
		if (num==0)
		{
			System.out.println("Number Digit is: 1");
		}
		else {
			while (num!=0)
			{
			num=num/10;
			count++;
			}
			System.out.println("Number Digit is:"+count);
		}
	}
}
