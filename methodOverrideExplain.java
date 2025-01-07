/*
>>Method override is different class with same method name,return type,argument with Non-static.
>>We can't override static method in java.
>>If you override static methods then it will be method hiding.
*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/*
Its Method hiding, why it is method hiding, because having static methods and same method name.

class A
{
	public static void load(){
		System.out.println("i am static no argument");
	}
}
class B extends A
{
	public static void load(){
		System.out.println("i am int argument:");
		
	}
}
class C extends B
{
	public static void load(){
		System.out.println("i am static String argument:");
		
	}
}
class methodOverrideExplain
{
	public static void main(String []sp)
	{
		A ref1=new C();//Upcasting, Its is As usual parent class members accessing.
		C ref2=(C)ref1;
		ref2.load();
		ref1.load();
	}
	
}
	
*/




class Parent {
    void show() {
        System.out.println("Parent's instance method");
    }
}

class Child extends Parent {
    //@Override
    void show() {
        System.out.println("Child's instance method");
    }
}

class P1 extends Parent {
    void show() {
        System.out.println("Mosts child");
    }
}

public class methodOverrideExplain{
    public static void main(String[] args) {
        Parent obj = new Child(); // Polymorphism
        obj.show(); // Outputs: "Child's instance method"
        Parent obj1 = new P1(); // Polymorphism
		obj1.show();
    }
}
/*
At compile-time, the compiler looks at the reference type (Parent) and confirms that the show() method exists.
At runtime, the JVM determines the actual object type (Child) and calls the show() method of the Child class

But you gave different different methods its always giving parent class members.
*/

