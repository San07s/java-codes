class Engine
{
	String power;
	int cc;
	String type;
	
	Engine(String power,int cc,String type)
	{
		this.power=power;
		this.cc=cc;
		this.type=type;
	}
	public void detailsofEngine()
	{
		System.out.println("Engine Power:"+power);
		System.out.println("Engine CC:"+cc);
		System.out.println("Engine Type:"+type);
	}
}


class Car
{
	String name,color;
	double price;
	Engine e;
	static String owner="Santhosh";
	
	Car(String name,String color,double price,Engine e)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	
	public void detailsofCar()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("Owner:"+owner);
		System.out.println("====================");
		
	}
}

class EarlyInstantiation
{
	public static void main(String []sp)
	{
		//Car car1=new Car("BMW","Black",140000, new Engine("8000hp",400,"Diesel"));
		Car c1 = new Car("BMW", "Black", 140000, new Engine("8000hp", 400, "Diesel"));

	    c1.detailsofCar();
		c1.e.detailsofEngine();
	}
}



