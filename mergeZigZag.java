//This Program conveys how to merge two array like ZigZag 
import java.util.*;
class mergeZigZag
{
	public static int[] merge(int a[],int b[])
	{
		int combine[]=new int[a.length+b.length];
		
		for (int i=0,n=0,m=0;i<combine.length;i++)
		{
			if (i<combine.length)
			{
				combine[i]=a[n];
				n++;
				++i;
				combine[i]=b[m];
				m++;
			}

		}
		System.out.println(Arrays.toString(combine));
		return combine;
	}
	public static void main(String []sp)
	{
		int x[]={1,2,3,4,5};
		int y[]={6,7,8,9,10};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		merge(x,y);
	}
		
}