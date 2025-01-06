/*
This program creates 3 way of String creations.

You wannna create String first you create object Here, 3 ways of object creations
<String>.<StringBuffer>.<StringBuilder>

String you can create with or without using new Keyword.
StringBuffer you can only create using new Keyword.
StringBuilder you can only create using new Keyword.
*/

class string_3_creation
{
	public static void main(String []sp)
	{
		String s1="Santhosh";
		String s2=new String("Santhosh");
		StringBuffer s3=new StringBuffer("Santhosh");
		StringBuilder s4=new StringBuilder("Santhosh");

		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		//Length of String 
	        System.out.println(s1.length());
	}
}
