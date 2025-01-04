/*
This program conveys TargetSum 
// This Program Mine>>>

import java.util.*;
class targetSum
{
	public static void main(String []sp)
	{
		int a[]={2,8,5,3,7,4,6,5,6};
		Arrays.sort(a);
		String ans="";
		int target=12;
		for (int i=0;i<a.length;i++)
		{
			for (int k=i+1;k<a.length;k++)
			{
				if (a[i]+a[k]==target)
				{
					ans=ans+a[i]+","+a[k]+"\n";
				}
			}
		}
		System.out.println(ans);
	}
}
*/

// Two Numbers target Sum
/*
import java.util.*;
class targetSum
{
	public static void main(String []sp)
	{
		int s[]={2,3,4,5,6,7,8,9};
		Arrays.sort(s);
		int tar=10;
		target(s,tar);
	}
	public static void target(int a[],int target)
	{
		int l=0,r=a.length-1;
		String ans="";
		
		while (l<r)
		{
			if (a[l]+a[r]==target)
			{
				ans+=a[l]+","+a[r]+"\n";
				l++;
				r--;
			}
			else if (a[l]+a[r]>target)
			{
				r--;
			}
			else{
				l++;
			}
				
		}
		System.out.println(ans);
	}
}

*/
// Three Numbers Target Sum
/*
import java.util.*;
class targetSum
{
	public static void main(String []sp)
	{
		int s[]={1,2,3,4,5,6,7,8,9,19,10};
		Arrays.sort(s);
		int tar=24;
		target(s,tar);
	}
	public static void target(int a[],int target)
	{
		String ans="";
		for (int i=0;i<a.length;i++)
		{
			int l=i+1,r=a.length-1;
			while (l<r)
			{
				if (a[i]+a[l]+a[r]==target)
				{
					ans+=a[i]+","+a[l]+","+a[r]+"\n";
					l++;
					r--;
				}
				else if (a[i]+a[l]+a[r]>target)
				{
					r--;
				}
				else{
					l++;
				}
			}	
		}
		System.out.println(ans);
	}
}

*/
//Four Numbers Target

import java.util.*;
class targetSum
{
	public static void main(String []sp)
	{
		int s[]={1,2,3,4,5,6,7,8,9,19,10};
		Arrays.sort(s);
		int tar=36;
		target(s,tar);
	}
	public static void target(int a[],int target)
	{
		String ans="";
		for (int i=0;i<a.length;i++)
		{
			int l=i+1,t=l+1,r=a.length-1;
			while (l<r)
			{
				if (a[i]+a[t]+a[l]+a[r]==target)
				{
					ans+=a[i]+","+a[t]+","+a[l]+","+a[r]+"\n";
					l++;
					t++;
					r--;
				}
				else if (a[i]+a[l]+a[r]>target)
				{
					r--;
				}
				else{
					l++;
				}
			}	
		}
		System.out.println(ans);
	}
}






















