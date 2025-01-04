import java.util.*;
class missingNumber
{
	public static String missing(int a[])
	{
		int n=1;
		String ans=" ";
		boolean y=true;
		for (int i=0;i<a.length;i++,n++)
		{
			if (a[i]!=n)
			{
				ans+=n+" ";
				i--;
				y=false;
			}
		}
		if (y)
			return "No Missing Value";
		return ans;
	}
	public static void main(String []sp)
	{
		int s[]={2,4,6,8};
		System.out.println(Arrays.toString(s));
		System.out.println(missing(s));
	}
	
}