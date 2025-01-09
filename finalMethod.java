/*

This is final class program.

>Its a keyword.
>Its a Modifier
>It represent constant.

* A class prefix with final it is called as final class.
* We cannot Inherit final class.

final class A
{
	
}
class B extends A // Error, We cant inherit final class
{
}
*/

// This is final method program.
// We can Inherit final method, but we can't Override. (See last program to clarify.)

//* A method prefix with final it is called as final method.
//* We can Inherit final method.

class A 
{
	public static final void m1(){
		System.out.println("Calling m1 method");
	}
}
class B extends A
{
	public static final void m2(){
		System.out.println("Calling m2 method");
	}
}
class C extends B
{
	public static final void m3(){
		System.out.println("Calling m3 method");
	}
}
class finalMethod
{
	public static void main(String []sp)
	{
		C ref=new C();
		
		ref.m1();
		ref.m2();
		ref.m3();
	}
}



/* This is final method program but tried to Override, but we got an error.So we cant do it.



class chandru
{
	final public static void sport(){
		System.out.println("Chess");
	}
}
class santhosh extends chandru
{
	final public static void sport(){ // Cant Override
		System.out.println("Cricket");
	}
}
class finalMethod
{
	public static void main(String []sp)
	{
		santhosh ref= new santhosh();
	    ref.sport();// <Error>
	}
}

*/