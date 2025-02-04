/*
* This is Anonymous class.
* It is like a class but not having class name.
* We can override methods of interface as well as class.

*/


interface Instrument
{
	void guitor(); // Always interface takes if you are giving like this void guitor(); but compiler takes
	void flute();  // public abstract void guitor(); so if you are access this methods you should
	               //  give public prefix with methods.like 13th and 17th line.
}
class anonymous
{
	public static void main(String []sp)
	{
		Instrument ref=new Instrument() { // Here anonymous block started
			@Override
			public void guitor(){
				System.out.println("Guitor is Playing");
			}
			@Override
			public void flute(){
				System.out.println("Flute is Playing");
			}
		};// Here finish block
		
		ref.guitor();
		ref.flute();
	}
}

/*
Another Example:

interface food
{
	void eating();
	void drinking();
}
class anonymous
{
	public static void main(String []sp)
	{
		food ref=new food() {
			@Override
			public void eating(){
				System.out.println("Eating Briyani");
			}
			@Override
			public void drinking(){
				System.out.println("Drinking Juice");
			}
		};
		ref.eating();
		ref.drinking();
	}
}
*/