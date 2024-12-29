import java.util.Scanner;
import java.util.Arrays;
class RotationalArray
{
	public static void main(String []sp)
	{
		Scanner s=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.print("Enter Your Number:");
		int n=s.nextInt();
		for (int k=1;k<=n;k++)
		{
			int first=a[0];
			for (int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}
		
}