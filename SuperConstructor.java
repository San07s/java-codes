/*
This program is Super class program ,it is used to Call parent class Constructor ... And You should pass super 
class first argument as constructor class then load instructions .
*/
class A
{
	A()
	{
		System.out.println("Java");
	}
	A(int a)
	{
		System.out.println("Mental uh");
		System.out.println(a);
	}
}
class B extends A
{
	B()
	{
		super();// this line calls parent class No argument constructor (that is 7th line)
		System.out.println("Azhagiiii");
	}
	B(String c)
	{
		super(76);// this line calls parent class integer argument constructor (that is 11th line)
		System.out.println("Podaa..hhh");
	}
}
class SuperConstructor
{
	public static void main(String []sp)
	{
		B ref1=new B();// this line calls no argument of B class Constructor(that is 19 th line )
		B ref2=new B("Santhoosh");// this line calls String argument of B class constructor(that is 24th line)
	}
}

/*

class fruit
{
	fruit()
	{
		System.out.println("Lakshmi Starts");
	}
	fruit(String s)
	{
		System.out.println(s);
		System.out.println("En Pera kettaa ('-')>");
	}
}
class Orange extends fruit
{
	Orange()
	{
		super();
		System.out.println("Annan Vararu Vazhi Viduuehh");
	}
	Orange(int a)
	{
		super("Bashaa...");
		System.out.println("Oorae Nadungum");
	}
		
}
class SuperConstructor
{
	public static void main(String []sp)
	{
		Orange s1=new Orange(96);
		Orange s2=new Orange();
	}
}


*/



















