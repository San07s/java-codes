//This is With Method 
import java.util.*;
class primeArraySum
{
	public static boolean isprime(int a)
	{
		if (a==0 && a==1)
		{
			return false;
		}
		else {
			for (int i=2;i<a;i++)
			{
				if (a%i==0)//don't Give i%a, always give which number you check prime or not that number give first
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void solve(int b[])
	{
		int sum=0;
		for (int k=0;k<b.length;k++)
		{
			if (isprime(b[k]))// this if condition satisfied and Add the number
			{
				sum=sum+b[k];
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("Prime Sum:"+sum);
	}
	public static void main(String []sp)
	{
		int x[]={2,3,0,4,5,7,8};
		solve(x);
	}
	

}