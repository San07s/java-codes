class charAt
{
	public static void main(String []sp)
	{
		String s1="Santhosh";
		
		StringBuffer s2=new StringBuffer("Santhosh");
		
		StringBuilder s3=new StringBuilder("Santhosh");
		
		char ref1=s1.charAt(0);
		char ref2=s2.charAt(1);
		char ref3=s3.charAt(2);
		
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
	}
}