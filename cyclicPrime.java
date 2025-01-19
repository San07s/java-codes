/*
This is cyclic program.

*  Start with a prime number.
*  Rotate the digits of the number in all possible ways (i.e., cyclic shifts).
*  Check if each of the rotations is also prime.
*  If all the rotations are prime, the number is a cyclic prime.
*  If any one number is not Prime that is not cyclic prime.

*/

class cyclicPrime
{
	public static void main(String []sp)
	{
		String a="119";
		String temp=a; // it store a, value into temp container
		String ans="";
		boolean flag=true;// its check cyclic prime or not (line at 30)
		for (int i=0;i<a.length();i++)// its run till a length().
		{
			ans="";
			char first=a.charAt(0);// this container stores first value of a.
			for (int j=1;j<a.length();j++)// this loops run till a length().
			{
				ans+=a.charAt(j);
			}
			ans+=first;// then merge ans and first value
			a=ans;
			int num=Integer.parseInt(a);
			if (isprime(num))// its go to the isprime function and check .
			{
				System.out.println(a+":prime");
			}
			else{
				System.out.println(a+": Not Prime");
				flag=false;// In rotation if any number gets not prime then flag=false.
			}
		}
		System.out.println("-------------------------------");
		if (flag)
		{
			System.out.println(a+":Cyclic Prime");
		}
		else{
			System.out.println(a+":Not Cyclic Prime");
		}
	}
		public static boolean isprime(int x)
		{
			for (int i=2;i<x;i++)
			{
				if (x%i==0)
				{
					return false;
				}
			}
			return true;
		}
}