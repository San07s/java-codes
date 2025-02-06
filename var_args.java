/*
* It is a Variable Arguments program (Var-args)
* Its is used to technique for the methods.
* It allows method to accept any number pf parameters which is treated as array.

* It should Be Last at parameter(EX: int a,int b,int...c)

Syntax:
      Use three dots(...)before variable name.

*/

class A
{
	public void sample(int...a){
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
class var_args
{
	public static void main(String []sp)
	{
		A ref=new A();
		ref.sample(251,7,865,97,9697,5845,3,234,654,8,87,9,432);
	}
}