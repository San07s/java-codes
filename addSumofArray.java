import java.util.*;
class addSumofArray 
{
	public static int san(int s[])
	{
		int sum=0;
		for (int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		return sum;
	}
	public static void main(String[]sp)
	{
		int p[]={1,2,3,4,5};
		System.out.println(Arrays.toString(p));
		int res=san(p);
		System.out.println("Sum of Array values:"+res);
	}
}


/*
//add only even numbers in the array

import java.util.*;
class addSumofArray 
{
	public static int san(int s[])
	{
		int sum=0;
		for (int i=0;i<s.length;i++)
		{
			if (s[i]%2==0)
			{
				sum=sum+s[i];
			}
		}
		return sum;
	}
	public static void main(String[]sp)
	{
		int p[]={1,2,3,4,5};
		System.out.println(Arrays.toString(p));
		int res=san(p);
		System.out.println("Sum of Array values:"+res);
	}
}
*/
