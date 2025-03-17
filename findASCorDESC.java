import java.util.*;
class findASCorDESC
{
	public static void main(String []sp)
	{
		int a[]={1,2,3,4,5,3};
		boolean b=method(a);
		System.out.println(b);
	}
	public static boolean method(int a[])
	{
		boolean flag=true;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]<=a[j])
				{
					flag=true;
				}
				else if (a[i]>a[j])
				{
					return false;
				}
			}
		}
		return true;
	}
}