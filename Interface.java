/*
This is Interface Program.
>We go for interface to achieve 100% of abstraction and Multiple Inheritance.
>Interface is component in java which is similiar to class.
>Interface is not allow Constructor to achieve Multiple Inheritance.

Points of Interface.
-------------------
REMEMBER: If you are creating interface compiler automatically add abstraction .(compiler takes like this>>>
          example > if you are giving like this   interface hotel {                 abstract interface{
		  	                                        void meals();    compiler-->>     abstract void meals();
		                                          }                                }
REMEMBER: Interface and Abstraction cannot allow non-static method along with body.
          because it will reduce abstraction.if you are giving static method then compiler will ask body.
KEY CONCEPT :
Interface and Abstracton purpose is only providing important feature, but hiding implementation(Body).
(if you are giving body in the interface that must be static method ,because static method can't Override)

<<<THEN YOU CAN GIVE NON-STATIC METHOD NOT BODY.>>>
Then you can Override the method and can give the body.
       
@ It will not allow Non-static method along with body

@ The (above the main method)global variable of the interface will be prefix with public static final.
  (So, we can't modify ,because internally compiler add final)
  <Only applicable for interface variable .It means between interface and main method.>

  
@ final and abstract is compile time Error(C.T.E)
@ private and abstract is compile time Error(C.T.E)
@ interface will not allow Constructor to achieve Multiple Inheritance.
@ Multi line Initializer is not allow in interface.
@ We can't create object for interface because compiler internally add abstraction and also can't have constructor


If you are merging (interface and interface) to use extends.
If you are merging (class and class) to use extends.
If you are merging (interface and class) to use implements.

****** CLASS CANNOT BE PARENT OF INTERFACE ******
*/



interface bank
{
	String GOVERNOR="RBI";
	void rateOfInterest();
}
class sbi implements bank
{
	public void rateOfInterest(){
		System.out.println("GOVERNOR:"+GOVERNOR);
		System.out.println("SBI BANK RateOfInterest is:15%");
	}
}
class union implements bank
{
	public void rateOfInterest(){
		System.out.println("GOVERNOR:"+GOVERNOR);
		System.out.println("UNION BANK RateOfInterest is:10%");
	}
}
class Interface
{
	public static void main(String []sp)
	{
		bank ref1=new sbi();
		ref1.rateOfInterest();
		bank ref2=new union();
		ref2.rateOfInterest();
	}
}


/*
Another example,


interface one
{
	void getval();     // if you are giving two interface methods then you must use two methods which is class
	void putval();     // connect to the interface .
}
class a implements one // Here, class a connects to the interface so you must use two methods of interface
{                      // in class a.(if you are using one method of interface in class a that is ERROR.
	public void getval(){
		System.out.println("Santhosh 1");
	}
	public void putval(){
		System.out.println("Santhosh 2");
	}
}
class b extends a        // Here not connect to the interface so you can use interface method or Not.
{
	public void getval(){
		System.out.println("Santhosh 3");
	}
}
class rough
{
	public static void main(String []sp)
	{
		one ref1=new b();
		ref1.getval();
	}
}


*/