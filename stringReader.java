import java.util.*;
class stringReader
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.println("Single word Reader");
		System.out.print("Enter your Name:");
		String name1=s.next();// Santhosh Push
		// Its s.next() read Single word
		
		System.out.println(name1);// Santhosh
		System.out.println("************************");
		
		s.nextLine();// Its is use to go to second input
		
		System.out.println("Read Full Sentence");
		System.out.print("Enter you Name:");
		String name2=s.nextLine();
		
		System.out.println(name2);

	}
}