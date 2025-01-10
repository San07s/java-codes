// This final variable Explanation.

// * Any variable prefix with final it is called as final variable.
// * We can't re-assign final variable or can't change.
// * We can inherit final variable but can't modify
/*
<<<Can we re-assingn final variable ? [No]>>>

class finalVariable
{
	final static int a=10;
	final int b=20;
	
	public static void main(String []sp)
	{
		finalVariable ref=new finalVariable();
		
		System.out.println(finalVariable.a);
		
		System.out.println(ref.b);
		
		//a=30;   error: cannot assign a value to static final variable a
	}
}
*/

//<<<Can We declare final variable in global area? [No] >>>
/*
class finalVariable
{
	final static int a;    // This is Error,because (global variable) or final static variable and final instance  
	final static int b;    // variable can't be declared .
	                       // But we can declare with help of Multiline Initializer .
	
	public static void main(String []sp)
	{
		finalVariable ref=new finalVariable();
	}
}
*/

// [We can declare final static variable and final instance variable with help of Multi line initializer.]
//  * We can inherit final variable but can't modify.

class finalVariable
{
	final static int a;
	final int b;
		
		static {  // Multiline static Initializer
			a=17;
		}
		{         // Multiline non-static Initializer
			b=28;
		}
		
	public static void main(String []sp)
	{
		finalVariable ref=new finalVariable();
		System.out.println(finalVariable.a);
		System.out.println(ref.b);
	}
}

// [But,We can declare local variable and Initialize in the next Line.]

/*
class finalVariable
{
	public static void main(String []sp)
	{
		final int a;
		a=98;
	}
}

*/
