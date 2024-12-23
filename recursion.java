/* It is Process were one method is calling itself, it is called Recursion...
*/
//Here, print 1 to 10 without using looping stmts
import java.util.Scanner;
class recursion
{
	static int start=1,n;
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter your Number:");
		n=s.nextInt();
		solve();
		System.out.println("Program Ends");
	}
	public static void solve()
	{
		if (n>=start)
		{
			System.out.println(start);
			start++;
			solve();
		}
		//return;
	}
}



/*
This program 10 to 1

import java.util.*;
class rough
{
	static int end=1,n;
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter your Number:");
		n=s.nextInt();
		solve();
		System.out.println("Program Ends");
	}
	public static void solve()
	{
		if (n>=end)
		{
			System.out.println(n);
			n--;
			solve();
		}
	}
}

*/