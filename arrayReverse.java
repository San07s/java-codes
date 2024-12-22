import java.util.*;
class arrayReverse 
{
	public static int[] san(int a[])
	{
		int reverse[]=new int[a.length];
		for (int i=a.length-1;i>=0;i--)
		{
			reverse[i]=a[a.length-1-i];
		}
		return reverse;
	}
	public static void main(String[]sp)
	{
		int x[]={10,20,30,40,50};
		System.out.println(Arrays.toString(x));
		int res[]=san(x);
		System.out.println(Arrays.toString(res));
	}

}
