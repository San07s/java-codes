class product
{
	String name;
	double price;
	int qty;
	static String mall="Nexus";
	
	public product(String n,double p,int qty)
	{
		name=n;
		price=p;
		this.qty=qty;
	}
	public void product()
	{
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+qty);
		System.out.println("Mall:"+mall);
		System.out.println("**************************************");
	}	
}

class productArray
{
	public static void main(String []sp)
	{
		product s1=new product("Watch",190,1);
		product s2=new product("Ring",230,2);
		product s3=new product("Slipper",100,1);
		s1.product();
		s2.product();
		s3.product();
		
	   product [] arr={s1,s2,s3};//product ARRAY
	   double bill=0;
	   for (int i=0;i<arr.length;i++)
	   {
		   bill=bill+arr[i].price;
	   }
	   System.out.println("Total Price:"+bill);
	}
}