class Mobile
{
	 String color="Black";
	 private int pin=1234;
	
	 public int getpin()
		 {
		 return pin;
		 }
	 public void setpin(int npin)
		 {
		 pin=npin;
		 }
}

class EncapsulationWithDataHiding
{
	public static void main(String []sp)
	{
		Mobile m=new Mobile();
		System.out.println(m.color);
		System.out.println("Before Modification:"+m.getpin());
		m.setpin(7589);
		System.out.println("After Modification:"+m.getpin());
	}
		
}