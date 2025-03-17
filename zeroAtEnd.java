import java.util.*;
class zeroAtEnd
{
	public static void main(String []sp)
	{
		int a[]={0,1,2,0,4,5};
		
		System.out.println(Arrays.toString(a));
		
		int index=0,last=a.length-1;
		
		int res[]=new int[a.length];
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i] != 0)
			{
				res[index]=a[i];
				index++;
			}
			else if (a[i]==0)
			{
				res[last]=a[i];
				last--;
			}
		}
		System.out.println(Arrays.toString(res));

	}
}