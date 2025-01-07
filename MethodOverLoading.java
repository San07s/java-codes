/*
 A class having multiple methods with the same name but different forms that is called as 
 Method Over loading .
*/

class MethodOverLoading
{
	public static void load()
	{
		System.out.println("i am static no argument");
	}
	public void load(int a){
		System.out.println("i am int argument:"+a);
		
	}
	public static void load(String b){
		System.out.println("i am static String argument:"+b);
		
	}
	public void load(double m,String n){
		System.out.println("i am double and String argument:"+m+"<>"+n);
		
	}
	public static void load(int s,String v){
		System.out.println("i am static int and string argument:"+s+"<>"+v);
		
	}
	public static void main(String []sp)
	{
		
		MethodOverLoading ref=new MethodOverLoading();
		
		load(11,"Santhosh");
		ref.load(33.3,"Push");
		ref.load(); 
		load("Booo");
		ref.load(45);
		load();
// we can access static members with help of class name or object reference .
// But,we can access Non-static members with help of object reference only.
		
	}
}