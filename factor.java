import java.util.Scanner;
class factor 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your number:");
		int number=s.nextInt();
		
		for (int i=1;i<=number/2 ;i++ )
		{
			if(number%i==0)
				System.out.println("Factors:"+i);
		}
	}
}
