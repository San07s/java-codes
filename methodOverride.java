/*
This is Method Overriding Program.

Runtime-polymorphism
---------------------
If the Binding done by the JVM at runtime for the polymorphism state program that is called as
Runtime-polymorphism.

Method Overriding
-----------------
The process of providing implementation(class body) for the parent non-static method by child non-static
method is called as method overriding.

<And it should be Non-Static>


*/

/*
class A
{
	public void san(){
		System.out.println("I am in Chennai");
	}
}
class B extends A
{
	@Override
	public void san(){
		System.out.println("I am in Banglore");
	}
}
class C extends B
{
	@Override
	public void san(){
		System.out.println("I am in Kerla");
	}
}
class methodOverride
{
	public static void main(String []sp)
	{
		A ref0=new A();//Its Normal Object creation, And always giving parent members
		
		A ref1=new B();//Its upcasting but overriding, so overrided class body will come as output in A to B class
		               // so B class will come as out put.
		
		B ref2=new C();//Its upcasting but overriding, so overrided class body will come as output in B to C class
		               // so C class will come as out put.
		
		
		C ref3=new C();// This is last overrided So out as class C .
		
		ref0.san();
		ref1.san();
		ref2.san();
		ref3.san();
	}
}

*/
// In this If you want Zero experience Don't override if you want change, Override.

// *** here File name is methodOverride
// *** but class name is change so, if you want to run this code see properly and run it.

class Engineer
{
	static String loc;
	Engineer()
	{}
	Engineer(String loc)
	{
		this.loc=loc;
	}
	public static void working()
	{
		System.out.println("Working XYZ company in "+loc);
	}
	public int exp()
	{
		return 0;
	}
}
class tabrez extends Engineer
{
	tabrez()
	{}
	tabrez(String loc)
	{
		super(loc);
	}
	public static void main(String []sp)// If you want to run this main method give(java tabrez)
	{
		tabrez ref1=new tabrez("Bangalore");
	    ref1.working();
        System.out.println("Tabrez Experience:"+ref1.exp());
	}
	@Override// Overriding the Experience
	public int exp(){
		return 5;
	}
}
class bharath extends Engineer 
{
	bharath()
	{}
	bharath(String loc)
	{
		super(loc);
	}
	public static void main(String []sp)// If you want to run this main method give(java bharath)
	{
		bharath ref1=new bharath("Chennai");
		ref1.working();
		System.out.println("Bharath Experience:"+ref1.exp());
	}
	@Override// Overriding the Experience
	public int exp(){
		return 2;
	}
}