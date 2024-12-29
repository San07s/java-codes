import java.util.Scanner;
class perfectnumber
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your number:");
		int n=s.nextInt(),sum=0;
		
		for (int i=1;i<=n/2 ;i++ )
		{
			if(n%i==0)
				sum+=i;	
		}
		if(sum==n)
			System.out.println(n+" : is perfect");
		else
			System.out.println(n+" : is not perfect");
	}
}
