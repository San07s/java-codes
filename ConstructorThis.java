/*
This Program is Constructor Chaining using -this- keyword and >>> Here, one >this< statement is calling 
another constructor so its Constructor chaining ...
>>>>> And Its printing Bottom to Top <<<<<
*/

// If you are using 100 constructors you should give 99 this statements...

class ConstructorThis
{
	ConstructorThis()
	{
		this(7);
		System.out.println("First Constructor");
	}
	ConstructorThis(int a)
	{
		this("Santhosh");
		System.out.println("Second Construtor");
		System.out.println(a);
	}
	ConstructorThis(String b)
	{
		this(77,"Pushpalatha");
		System.out.println("Third Constructor");
		System.out.println(b);
	}
	ConstructorThis(int a,String c)
	{
		System.out.println("Fourth Constructor");
		System.out.println(a+" "+c);
	}
	
	public static void main(String []sp)
	{
		
		ConstructorThis s1=new ConstructorThis();
	}
}