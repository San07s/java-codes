/*
This is abstract program.

"The process of providing important feature but hiding the implementation is called as Abstraction."

"Any class prefix with abstract that is called abstract class."

"Any Non-static method prefix with abstract that is called abstract method."

TO Understand abstraction in better way we need to Understand about 3 terminologies:)
																* Service Specifier
																* Service Provider
																* End-User
Important NOTE:
          * Whenever a class is having abstract method either present or inherited we should prefix the class 
            with "abstract".
          * If the programmer is not ready to prefix the class with abstract then "we should override."
		  * We can't create object for abstract class.
			Here, main is abstract class so we can't create(main ref1=new main();)	but we can create
			(main ref1=new india();).


*/


abstract class main// Service Specification
{
	abstract public void run();
	abstract public void stop();
}
class india extends main// Service Provider          <--- This is Concrete Implementing class
{
	public void run(){
		System.out.println("Indian Bike is Runnning");
	}
	public void stop(){
		System.out.println("Indian Bike is Stopping");
	}
}
class japan extends main
{
	public void run(){
		System.out.println("Japan Bike is Runnning");
	}
	public void stop(){
		System.out.println("Japan Bike is Stopping");
	}
}
class Abstract// End-User                            <--- This is Concrete Implementing class
{
	public static void main(String []sp)
	{
		main ref1=new india(); // We can't create object for abstract class but we can upcaste.
		
		ref1.run();
		ref1.stop();
		
		System.out.println("*********************************");
		main ref2=new japan();
		
		ref2.run();
		ref2.stop();
	}
}

/*
Concrete Implementing Class
----------------------------
The class which is not prefix with abstract and also taking the responsibility to provide implementation for
the abstract method is called as Concrete implementing class.
*/