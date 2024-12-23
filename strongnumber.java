import java.util.Scanner;
class strongnumber
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		int temp=num,sum=0,prod=1;
		while (num>0)
		{
			int last=num%10;
			for (int i=1;i<=last ;i++ )
			{
				prod=prod*i;
			}
			sum=sum+prod;
			prod=1;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("Strong");
		}
		else 
			System.out.println("Not Strong");
	}
}
