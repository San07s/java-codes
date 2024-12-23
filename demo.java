class demo
{
	int x;
	static int y=20;
	
	demo(int a)
	{
		x=a;
		System.out.println("Hi I am Demo");
	}
	{//this block is execute before constructor or method //* And easy to remember with in curly braces *
		//This is Instance Initializers
		System.out.println("Hi I am MLNSI");
	}
	public static void main(String []sp)
	{
		System.out.println("Hello");
		demo d=new demo(8);
		System.out.println(d);
	}
	static 
	{
		System.out.println("Hi I am MLSI");
	}
}