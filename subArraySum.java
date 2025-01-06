/*
This Program conveys SubArrays Maximum Sum 
*/
import java.util.*;
class subArraySum
{
	public static void main(String []sp)
	{
		int s[]={2,3,4,5};
		int res=subs(s);
		System.out.println("Max Subarray Sum:"+res);
	}
	public static int subs(int []x)
	{
		int max=Integer.MIN_VALUE;
		System.out.println("\t\t"+Arrays.toString(x));
		
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x.length;j++)
			{
				int curr_sum=0;
				for (int k=0;k<=j;k++)
				{
					curr_sum+=x[k];
				}
				if(curr_sum>max)
					max=curr_sum;
			}
		}
		return max;
	}
}
/*
 Output:       [2, 3, 4, 5]
Max Subarray Sum:14
*/