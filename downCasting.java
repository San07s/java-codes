/*
This is Down Casting program .Definition>>> The Process of converting parent object into child object that is
called Downcasting ) whenever, we stuck in upcasting problem to use downcasting to overcome the problem. 
*/
class x
{
	int s=67;
}
class y extends x
{
	int b=84;
}
class downCasting 
{
	public static void main(String []sp)
	{
		x ref1=new y();//Here, upcasting (here, x is parent class. y is child class )
		y ref2=(y)ref1;//Here,Down Casting(here, x is also parent but down casting is the process of converting 
		               // parent class into child class that is Downcasting...
		
		System.out.println(ref2.s);// Compile time Success(C.T.S)
		System.out.println(ref2.b);// here also compile time success because we did downcasting (if you didn't
		                           // use downcasting (line 18th) we will stuck in the problem)
	}  
}


/*
//Another Example

class A
{
	int m=168;
}
class B extends A
{
	int n=23;
}
class C extends B
{
	int k=14;
}
class D extends C
{
	int r=897;
}
class downCasting
{
	public static void main(String []sp)
	{
		A ref1=new C();// here, upcasting so we can't access child members,here access only parent members
		
		//D ref2=(D)ref1; Here Error>,ClassCastExceptionError(Because above the object you access only with in
		// A class to C class ,But you are asking D class member so thats why this Error)
		
		B ref2=(B)ref1;// here, downcasting we can access here B class members
		C ref3=(C)ref2;// here, also downcasting we can access here C class members
		
		System.out.println(ref1.m);
		System.out.println(ref2.n);
		System.out.println(ref3.k);
	}
}



*/