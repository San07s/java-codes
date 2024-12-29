/*what is SingleTon class?
      The Class for whom we can create only one object is called as SingleTon class.*/

class Mobile
{
	String name="Mi";
	double price=250000;
	static Mobile m;
	
	private Mobile()
	{
	}
	
	public static Mobile getMobilesobj()
	{
		if(m==null)
		{
			m=new Mobile();
		}
		return m;
	}
}

class SingleTonClass
{
	public static void main(String []sp)
	{
		Mobile s1=Mobile.getMobilesobj();
		Mobile s2=Mobile.getMobilesobj();
		Mobile s3=Mobile.getMobilesobj();
		
		
		System.out.println(s1);//Mobile@2f92e0f4
        System.out.println(s2);//Mobile@2f92e0f4
		System.out.println(s3);//Mobile@2f92e0f4
	}
}












