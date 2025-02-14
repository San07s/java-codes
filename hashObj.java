/*
   hashcode() method.
 
* The return type of hashcode() method is int.
* The java.lang.Object implementation of hashcode method is used to give the unique integer
  number for every object created.
* The unique number generated based on the reference of an object.  

*/

/*
// before overriding hashcode() method

class s3
{
	String brand;
	String color;
	double price;
	
	s3(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString(){
		return brand+" "+color+" "+price+" ";
	}
	public boolean equals(Object o)//Object o=new s3();(implicitly upcasting)
	{
		s3 ref=(s3)o;// downcasting
		
		return this.brand.equals(ref.brand) && this.color.equals(ref.color) && this.price==ref.price;
	}
}

class hashObj
{
	public static void main(String []sp)
	{
		s3 ref1=new s3("BMW","Black",5000000);
		s3 ref2=new s3("AUDI","Blue",5500000);
		s3 ref3=ref1;
		
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		
		System.out.println(ref1==ref2);
		System.out.println(ref1==ref3);
		
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));
		
		int  a=ref1.hashCode();// Before overriding it will produce hashcode based on address
		System.out.println(a);

		int  b=ref2.hashCode();// Before overriding it will produce hashcode based on address
		System.out.println(b);
		
		int  c=ref3.hashCode();// Before overriding it will produce hashcode based on address
		System.out.println(c);		
		
	}
}

*/


// after overriding hashcode() method
import java.util.Objects;
class s3
{
	String brand;
	String color;
	double price;
	
	s3(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString(){
		return brand+" "+color+" "+price+" ";
	}
	public boolean equals(Object o)//Object o=new s3();(implicitly upcasting)
	{
		s3 ref=(s3)o;// downcasting
		
		return this.brand.equals(ref.brand) && this.color.equals(ref.color) && this.price==ref.price;
	}
	public int hashCode(){
		return Objects.hash(brand,color,price);
	}
}

class hashObj
{
	public static void main(String []sp)
	{
		s3 ref1=new s3("BMW","Black",5000000);
		s3 ref2=new s3("AUDI","Blue",5500000);
		s3 ref3=ref1;
		
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		
		System.out.println(ref1==ref2);
		System.out.println(ref1==ref3);
		
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));
		
		int  a=ref1.hashCode();// after overriding it will produce hashcode based on states
		System.out.println(a);

		int  b=ref2.hashCode();// after overriding it will produce hashcode based on states
		System.out.println(b);
		
		int  c=ref3.hashCode();// after overriding it will produce hashcode based on states
		System.out.println(c);		
		
	}
}
