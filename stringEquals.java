// We can't equate Strings or compare using == operator 
// instead of using == operator we use equals function.

import java.util.Scanner;
class stringEquals
{
	public static void main(String []sp)
	{
		Scanner s=new Scanner(System.in);	

		System.out.print("Enter your string1:");
		String string1=s.nextLine();
		
		System.out.println(string1);
		
		
		System.out.print("Enter your string2:");
		String string2=s.nextLine();
		
		System.out.println(string2);
		
		System.out.println("is it Same?:"+string1.equals(string2));
	}
		
		
		
}