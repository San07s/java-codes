import java.util.Scanner;
class spynumber
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter the Number:");
		int num=s.nextInt();
		
		int temp=num,sum=0,prod=1;
		
		while (num>0)
		{
			sum+=num%10;
			prod*=num%10;
			num/=10;
		}
		System.out.println((sum==prod)?"spy":"Not a Spy");
	}
}