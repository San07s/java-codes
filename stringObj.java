//  equalto(==) is always compare the address.
//  equals() method is after overriding it will compare states. 


// These methods are present in object class.
/*

* We override toString() method to return state of an object instead of returning
  reference of an obeject.
* It return type is String.
 

// Before Overriding toString() method


/*
class s1
{
	int id=1;
}
class stringObj
{
	public static void main(String []sp)
	{
		s1 ref=new s1();
		System.out.println(ref);// s1@2f92e0f4 :> Here, printing object reference > it give address
		                        // to overcome we should override toString() method.    
	}
}
*/

// After Overriding toString() method

class s1
{
	int id=1;
	int roll=1001;
	
	public String toString(){
		return id+" "+roll+"";
	}
}
class stringObj
{
	public static void main(String []sp)
	{
		s1 ref=new s1();
		System.out.println(ref);//Now printing States.    
	}
}