/*
import java.util.Scanner;
class  Switch
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your value: ");
		char input=s.next().charAt(0);
		
		if (input>='0' && input<='9')
		{
			System.out.println("You entered value is Integer:"+input);
		}
		else if ((input>='A' && input<='Z') || (input>='a' && input<='z'))
		{
		switch (input)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("You Entered value is Vowel:"+input);
		break;
		default:System.out.println("You Entered value is Consonant:"+input);
		}
		}
		else 
		{
			System.out.println("You Entered value is Special Character:"+input);
		}
			
		
	}
}
*/

import java.util.Scanner;
class Switch
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.println("\t\t\tSelect your Crush");
		System.out.println("\t\t1.Samantha\n\t2.Pooja Hedge\n3.Sri Divya");
		int pair=s.nextInt();
		
		switch (pair)
		{
		case 1:System.out.println("Your CrusH is Samantha__:)");
		break;
		case 2:System.out.println("Your CrusH is Pooja Hedge.:)");
		break;
		case 3:System.out.println("Your CrusH is Sri Divya..:)");
		break;
		default:
			System.out.println("\t\tIf you want All Crushes\n Say Yes or No");
		char select=s.next().charAt(0);
		if (select=='Y' || select=='y')
		{
			System.out.println("Yes,You Got All Crushes...!:>)\nEnjoy with Your ****");
		}
		else
			{
				System.out.println("All Crushes are Feeling... Sad--)");
			}
		}
	}
		
}