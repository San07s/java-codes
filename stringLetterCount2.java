class stringLetterCount2
{
	public static void main(String []sp)
	{
		String s="aaabbaacc";
		char a[]=s.toCharArray();
		int count=1;
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]==a[i+1])
			{
				count++;
			}
			else{
				System.out.println(a[i]+":"+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1]+":"+count);
	}
}