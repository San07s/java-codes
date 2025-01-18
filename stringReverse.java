class stringReverse
{
	public static String reverse(String s)
	{
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	public static void solve(String s)
	{
		String a[]=s.split(" ");
		String ans="";
		for (int i=a.length-1;i>=0;i--)
		{
			if (i%2==0)
			{
				ans+=reverse(a[i])+" ";
			}
			else
				ans+=a[i]+" ";
		}
		System.out.println(s);
		System.out.println(ans);
	}
	public static void main(String []sp)
	{
		solve("hi how are you?");
	}
}