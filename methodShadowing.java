/*
This is Method Shadowing Program.

>>A parent class and child class having same method and same return type and same access modifier is called 
as method shadowing.
>>And It should be static.
*/

class A
{
	public static void shadow(){
		System.out.println("shadow1 playing");
	}
}
class B extends A
{
	public static void shadow(){
		System.out.println("shadow2 playing");
	}	
}
class methodShadowing extends B
{
	public static void shadow(){
		System.out.println("shadow3 playing");
	}
	
	public static void main(String []sp)
	{
		A ref1=new A();
		A ref2=new B();
		B ref3=new methodShadowing();
		
		B.shadow();
		shadow();// This is inside the main method so its calling methodShadowing class.
		methodShadowing.shadow();
		ref1.shadow();
		ref2.shadow();
		ref3.shadow();
	}
}