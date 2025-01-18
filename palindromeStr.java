// Mine

import java.util.*;
class palindromeStr
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Check your String palindrome or Not:");
		String str=s.nextLine();
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("\n\t\t\"Palindrome\"");
		else 
			System.out.println("\n\t\t\"Not Palindrome\"");
	}
}


/*
// Sir Program

import java.util.*;
class palindromeStr
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Check your String palindrome or Not:");
		String str=s.nextLine();
		
		if (isPalindrome(str))
		{
			System.out.println("Your String is \"palindrome\"");
		}
		else 
			System.out.println("Your String is \"Not Palindrome\"");
	}
	public static boolean isPalindrome(String a)
	{
		String rev="";
		for (int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		return rev.equals(a);
	}
}


*/