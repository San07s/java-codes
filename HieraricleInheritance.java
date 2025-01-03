/*
This is Program is Hieraricle Inheritance >>> Its one base class more than one derived class <<<

Here,Vehicle is parent class of car and bike , car and bike is child class
*/

class vehicle
{
	String veh_regno;
	vehicle()
	{
		
	}
	vehicle(String veh_regno)
	{
		this.veh_regno=veh_regno;
	}
}
class car extends vehicle //Car parent is Vehicle
{
	String name,color;
	double price;
	static String owner="Santhosh";
	car()
	{
		// here empty constructor , use of this (if you are calling car constructor with no argument that time
		// this constructor will be calling...
	}
	car(String name,String color,double price,String veh_regno)
	{
		super(veh_regno);
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void detailsOfCar()
	{
		System.out.println("Car Name:"+name);
		System.out.println("Car Color:"+color);
		System.out.println("Price :"+price);
		System.out.println("VehicleNo:"+veh_regno);
		System.out.println("Owner Name:"+owner);
		System.out.println("________________________");
	}
}

class bike extends vehicle  //Bike parent is Vehicle
{
	String name,color;
	double price;
	static String owner="Pushpalatha";
	bike()
	{
		
	}
	bike(String name,String color,double price,String veh_regno)
	{
		super(veh_regno);
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void detailsOfBike()
	{
		System.out.println("Bike Name:"+name);
		System.out.println("Bike Color:"+color);
		System.out.println("Price :"+price);
		System.out.println("VehicleNo:"+veh_regno);
		System.out.println("Owner Name:"+owner);
		System.out.println("________________________");
	}
}

class HieraricleInheritance
{
	public static void main(String []sp)
	{
		car c1=new car("Glanza","Blue",1100000,"TN-10C-2004");
		c1.detailsOfCar();
		bike b1=new bike("Fz","Black",150000,"TN-12A-0707");
		b1.detailsOfBike();
		
		car c2=new car();// if you are not giving 24th line to 28th line >>> 83th line will throw error. 
		                 // what error means (you gave argument construtor but this is no argument)
						 // so that, avoid this error we created no argument construtor.
	}
}