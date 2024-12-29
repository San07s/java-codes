import java.util.*;
class NthLargest
{
	static Scanner s=new Scanner(System.in);
	public static int nlargest(int []x)
	{
		int largest=x[0];
		System.out.print("Enter N value:");
		int n=s.nextInt();
		for (int k=1;k<=n;k++)
		{
			largest=x[0];
			for (int i=0;i<x.length;i++)
			{
				if (x[i]>largest)
					largest=x[i];
			}
			for (int i=0;i<x.length;i++)
			{
				if (x[i]==largest)
					x[i]=Integer.MIN_VALUE;
			}
		}
		return largest;
	}
		public static void main(String []sp)
		{
			int []a={16,23,56,78,90};
			System.out.println(Arrays.toString(a));
			System.out.println(nlargest(a));
		}
}














