import java.util.Scanner;
class OddorEven
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]sp)throws Exception 
	{
		System.out.println("Enter your Number:");
		int num=sc.nextInt();
		String res=(num%2==0)?"EVEN":"ODD";
		System.out.println("Processing...");
		Thread.sleep(20000);
		System.out.println("Your Entered Number is:"+res);
	}
}
 
 