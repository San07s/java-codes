/*
This is Variable Shadowing program.

If parent class and child class having same variables name is called variable shadowing.

It is static or Non-static Anything is Aplicable.
*/

class A
{
	static int x=10;
	int y=20;
}
class B extends A
{
	static int x=30;
	int y=40;
}
class variableShadowing extends B
{
	static int x=50;
	int y=60;
	
	public static void main(String []sp)
	{
		A ref1=new B();
		B ref2=new variableShadowing();
		variableShadowing ref3=new variableShadowing();
		
		System.out.println(x);// output is 50.>>Why its 50 means its inside the main method 
		System.out.println(A.x);// Static members with help of access Class name or object reference
		System.out.println(B.x);
		
		System.out.println(ref1.x+":"+ref1.y);// Non-static memebers with help of access only object reference
		System.out.println(ref2.x+":"+ref2.y);
		System.out.println(ref3.x+":"+ref3.y);
	}
}