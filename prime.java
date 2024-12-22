import java.util.Scanner;
class prime 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Your Number:");
		int num=s.nextInt();
		boolean is_prime=true;
		if(num==0 || num==1)
		{
			System.out.println(num+":is Neither prime Nor Composite");
			is_prime=false;
		}
		else 
		{
			for (int i=2;i<num ;i++ )
				{
				if (num%i==0)
					{
					is_prime=false;
					break;
					}
				}
				if(is_prime)
					System.out.println(num+": is prime");
				else
					System.out.println(num+": is composite");
					
		}
	}
}
