/*
This program is instanceofoperator program .Its is used to retrieve one class having another class variable ah?

Its a Binary operator.
It return type is Only boolean.
SynTax: (ref instance of type)

*/

class A
{
	int a=17;
}
class B extends A
{
	int b=87;
}
class C extends B
{
	int c=45;
}
class D extends A
{
	int d=90;
}
class E extends D
{
	int e=34;
}
class instanceofkeyword
{
	public static void main(String []sp)
	{
		A ref1=new C();// A to C class variables( C class la ennenna variables irukku )
		A ref2=new E();// A to E class variables( E class la ennenna variables irukku )
		
		System.out.println(ref1 instanceof A);//true
		System.out.println(ref1 instanceof B);//true
		System.out.println(ref1 instanceof C);//true
		System.out.println(ref1 instanceof D);//false (Above the C class in 3 class variables are available) 
		                                      //But this C class la D variables not in. So this is false.
		
		System.out.println(ref2 instanceof D);//true
		System.out.println(ref2 instanceof A);//true
		System.out.println(ref2 instanceof E);//true
		System.out.println(ref2 instanceof C);//false (Above the E class in 3 class variables are available) 
		                                      //But this D class C variables not in. So this is false.
		
	}
}
