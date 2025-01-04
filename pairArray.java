/*
This Program is Pair Program 
*/
import java.util.*;
class pairArray
{
	public static void pair(int []a)
	{
		for (int i=0;i<a.length;i++)
		{
			String ans="";
			for (int k=i+1;k<a.length;k++)
			{
				ans+="("+a[i]+","+a[k]+")";
			}
			System.out.println(ans);
		}
	}
	public static void main(String []sp)
	{
		int s[]={2,3,7,8};
		System.out.println(Arrays.toString(s));
		pair(s);
	}
}




