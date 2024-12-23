/*
class increment
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=(++a + a)+ ++a;
		char c='A';
		int d=++c +a;
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}*/


class increment
{
	public static void main(String[] args)
	{
		int a=14,b=20;
		a=(b++ +b);
		b=(a++ +a)+(++b +a);
		System.out.println(a+":"+b);
	}
	
}