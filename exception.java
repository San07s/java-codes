import java.util.*;
class exception
{
	public static void main(String []sp)
	{
		try
		{
			int a=10;
		    int b=0;
		    int c=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("We can't do this");
			System.out.println(e);
		}
	}
}

