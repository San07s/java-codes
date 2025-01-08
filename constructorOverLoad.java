/*
This is Constructor over Loading.

A class having constructor with same name but different formal arguments that is called 
constructor overLoading.

<And without using this call stmts>
*/

class constructorOverLoad
{
	constructorOverLoad()
	{
		System.out.println("No argument constructor");
	}
	constructorOverLoad(int a)
	{
		System.out.println("Integer constructor");
	}
	constructorOverLoad(String a)
	{
		System.out.println("String constructor");
	}
	constructorOverLoad(int a,String b)
	{
		System.out.println("Integer + String constructor");
	}
	public static void main(String []sp)
	{
		new constructorOverLoad();
		new constructorOverLoad("Santhosh");
		new constructorOverLoad(45);
		new constructorOverLoad(07,"Pushpalatha");
	}
}