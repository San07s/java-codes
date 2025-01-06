class subArrayCount
{
	public static void main(String []sp)
	{
		int s[]={2,3,4,5};
		subs(s);
	}
	public static void subs(int a[])
	{
		int count=0;
		for (int i=0;i<a.length;i++,count++)
		{
			String ans=""+a[i];
			System.out.print(ans+" ");
			for (int k=i+1;k<a.length;k++)
			{
				ans+=a[k];
				System.out.print(ans+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("Sub Array Count:"+count);
	}
}