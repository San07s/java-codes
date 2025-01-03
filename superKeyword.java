/*This program is super keyword using program 

super keyword is used to access the parent class members 

*/
class A
{
	int s=76;
}
class B extends A
{
	int s=96;
	public static void main(String []sp)
	{
		B ref=new B();
		ref.m1();
	}
	public void m1()//And we should use super keyword only inside the non-static block  
	{
		System.out.println(s);
		System.out.println(super.s);//Here, super keyword is access the parent class member
	}
}

/*
//Another Example>>>>

class A
{
	int p=98;
}
class B extends A
{
	int p=12;
	public void m2()
	{
		System.out.println(p);
		System.out.println(super.p);
	}
	public static void main(String []sp)
	{
		B ref=new B();
		ref.m2();
	}
}

*/