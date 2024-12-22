import java.util.Scanner;
class factorial 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your number:");
		int num=s.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			i=i*num;
			System.out.println(i);
		}
	}
}
