/*
Constructor is a Special class and it is used to derive same class name as Constructor name.
Here,Example>>>*/

class book 
{
	public book()
	{
		System.out.println("java2SE");
	}
	public book(int a)
	{
		System.out.println("java2EE:"+a);
	}
	book(String a)
	{
		System.out.println("java2ME:"+a);
	}
}

class constructor
{
	public static void main(String []sp)
	{
		book b1=new book();
		book b2=new book(7);
		book b3=new book("Santhosh");

	}
}
