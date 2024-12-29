class car
{
	String name;
	double price;
	String color;
	static String owner="Tabrez";
	
public void run()
{
	System.out.println(name+" is running");
}
public void stop()
{
	System.out.println(name+" stops");
}
}

class object 
{
	public static void main(String []sp)
	{
		car a=new car();
		car b=new car();

        System.out.println(a);
		System.out.println(b);
	}
}
