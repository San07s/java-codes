//  This program upcasting program

class x
{
	int s=67;
}
class y extends x
{
	int b=84;
}
class upcasting 
{
	public static void main(String []sp)
	{
		x ref1=new y();//Here, upcasting (here, x is parent class. y is child class )
		
		System.out.println(ref1.s);// Compile time Success(C.T.S)
		// System.out.println(ref1.b);// Compile time Error(C.T.E)>>>Here, you are trying to access child class 
	}   // variable. you can't access this because you did upcasting >>>x ref1=new y();<<< 
	    // when ever you are upcasting parent class only load...
}

/*
//Another Example

class A
{
	int r=10;
}
class B extends A
{
	int t=23;
	int y=72;
}
class C extends B
{
	int d=43;
}
class upcasting 
{
	public static void main(String []sp)
	{
		B ref1=new C();// with help of parent reference we can't access child class members.
		System.out.println(ref1.r);
	}
}

*/
