import java.util.Scanner;
class digitalsum
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] sp) 
	{
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while (num>0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println("You Entered Number is:"+temp);
		System.out.println("Adding of your Number:"+sum);
	}
}



