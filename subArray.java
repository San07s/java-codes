class subArray
{
	public static void main(String []sp)
	{
		int s[]={2,4,6,8};
		subs(s);
	}
	public static void subs(int a[])
	{
		for (int i=0;i<a.length;i++)//this for loop traversing full array
		{
			for (int k=i;k<a.length;k++)
			{
				for (int j=i;j<=k;j++)
				{
					System.out.print("("+a[j]+")");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
Output:

(2) (2)(4) (2)(4)(6) (2)(4)(6)(8)
(4) (4)(6) (4)(6)(8)
(6) (6)(8)
(8)

*/