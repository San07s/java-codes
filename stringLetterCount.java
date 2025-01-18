import java.util.*;
class stringLetterCount
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter your String:");
		String s=sc.nextLine();
		solve(s);
	}
	public static void solve(String x)
	{
		char []a=x.toCharArray();
		
		for (int i=0;i<a.length;i++)
		{
			int count=1;
			if (a[i]==' ')
			{
				continue;
			}
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					count++;
					a[j]=' ';
				}
			}
			System.out.println(a[i]+":"+count);
		}
	}
}