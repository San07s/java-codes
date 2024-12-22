class stu //constructorAndMethod
{
	String name;
	int id;
	double marks;
	static String school="xyx";
	
	public stu(String n,int i,double m)
	{
		name=n;
		id=i;
		marks=m;
	}
	public void details()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student ID:"+id);
		System.out.println("Student Marks:"+marks);
		System.out.println("Student School:"+school);
		System.out.println("******<<<_^^^_>>>******");
	}
}
class constructorAndMethod
{
	public static void main(String []sp)
		{
		stu a1=new stu("Santhosh",1001,90);
		stu a2=new stu("Pushpalatha",1002,98);
		a1.details();
		a2.details();
		}


}
