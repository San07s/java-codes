/*
    equals() method.
	
* The return type of equals() method is boolean.
* To equals method we can pass reference of any object.
* The java.lang.object class implementation of equals method is used to compare the 
  reference of two objects.
  
*/
/*
// before overriding equals method.

class s2
{
	int id;
	String name;
	
	s2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return "id:"+id+" "+"name:"+name;
	}
}
class equalsObj
{
	public static void main(String []sp)
	{
		s2 ref1=new s2(1,"San");
		s2 ref2=new s2(1,"San");
		
		System.out.println(ref1);
		System.out.println(ref2);

		System.out.println(ref1==ref2);//(false) It will compare address
		System.out.println(ref1.equals(ref2));//(false) It also compare address
	}
}
*/

// After overriding equals method.

class s2
{
	int id;
	String name;
	
	s2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return "id:"+id+" "+"name:"+name;
	}
	public boolean equals(Object o)// object o=new s2();>>> compiler will take like this.datails see(Line:81)
	{
		s2 s=(s2)o;// downcasting 
		
		return this.id==s.id && this.name.equals(s.name);
	}
}
class equalsObj
{
	public static void main(String []sp)
	{
		s2 ref1=new s2(1,"San");
		s2 ref2=new s2(1,"San");
		
		System.out.println(ref1);
		System.out.println(ref2);

		System.out.println(ref1==ref2);//(false) It will compare address
		System.out.println(ref1.equals(ref2));//(True) It will compare states.
	}
}


/*
Line 57:

Every class is java top most parent class is object class so,if you are calling object class
compiler will take like that.

So help of parent class we can't access child class members.so we did downcasting.
*/









