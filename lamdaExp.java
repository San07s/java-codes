/*
This is lamda Expression program.

* lamda Expressions are similiar to the methods but without method name.
* lamda expressions are only applicable for functional interface.


*/

interface san1
{
	void push();
}
class lamdaExp
{
	public static void main(String []sp)
	{
		san1 ref=() ->{
				System.out.println("Pushing the Push");
		};
		ref.push();
	}
}



/*
interface san2
{
	int boo();
}
class lamdaExp
{
	public static void main(String []sp)
	{
		int a=10;
		san2 ref=()->{
			return a;
		};
		ref.boo();
	}
	
}
*/
/*

interface one
{
	void getval(String a);
}
class lamdaExp
{
	public static void main(String []sp)
	{
		one ref=(a) ->{
			System.out.println(a);
		};
		ref.getval("String");
	}
}

*/