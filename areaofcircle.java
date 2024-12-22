import java.util.Scanner;
class areaofcircle 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter the Radius:");
		int r=s.nextInt();
		double result=areaofcircle(r);
		System.out.println("\t\tProcessing...");
		Thread.sleep(3000);
		System.out.println("Area of circle is:"+result);
	}
	public static double areaofcircle(int radius)
	{
		double pi=3.14;
		return pi*(radius*radius);
	}
}
