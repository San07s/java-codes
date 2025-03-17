import java.util.*;
class duplicate
{
	public static void main(String []sp)
	{
		int a[]={1,2,2,3,4,4,5,5,2};
		System.out.println(Arrays.toString(a));
		
		int index=0;
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					a[i]=Integer.MIN_VALUE;
					//a.remove(a[j]);
					count++;
				}
			}
		}
		int res[]=new int[a.length-count];
		for (int k=0;k<a.length;k++)
		{
			if (a[k] != Integer.MIN_VALUE)
			{
				res[index]=a[k];
				index++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
