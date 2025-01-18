import java.util.*;
class stringNumSum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter Your Number Mixing String:");
		String s=sc.nextLine();
		int res=solve(s);
		System.out.println(res);
	}
	public static int solve(String x)
	{
		char a[]=x.toCharArray();
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0' && a[i]<='9')
			{
				sum+=a[i]-48;
			}
		}
		return sum;
	}
}