class stu
{
	String name;
	int id;
	double mark;
	static String school="xyz";
	
	public stu(String name,int id,double mark)//constructor
	{
		this.name=name;
		this.id=id;
		this.mark=mark;
	}
	
	public void stu()//method
	{
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Mark:"+mark);
		System.out.println("School:"+school);
		System.out.println("**************************");
		
	}

}
class thisConstructor
{
	public static void main(String []sp)
	{
		stu s1=new stu("Santhosh",1001,90);//constructor call
		stu s2=new stu("Pushpalatha",1002,98);
		s1.stu();//method call
		s2.stu();
	}
}