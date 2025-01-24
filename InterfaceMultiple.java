// It is achieving Multiple Inheritance with Interface.
// We can't Inherit static method from the interface.
//       SCROLL DOWN--->Interface Types.>>>

interface santho
{
	public void singer();
}
interface boo
{
	public void dancer();
}
class InterfaceMultiple implements santho,boo
{
	@Override
	public void singer(){
		System.out.println("Priya Himsy");
	}
	@Override
	public void dancer(){
		System.out.println("Ragava Lawrence");
	}
	public static void main(String []sp)
	{
		santho m=new InterfaceMultiple();//In interface we can access only reference type even though its overrided
		m.singer();// In santho interface only singer method is there,so we can access only singer.
		//m.dancer();// its C.T.E because in the santho interface cannot have dancer.
		
		boo m1=(boo)m;// DownCasting(it can access only boo interface.)
		m1.dancer();
	}
}
/*
1.In Normal object creation,we can access parent class and child class members.
2.In Upcasting we can access only Parent class members.(To overcome this problem we have to do Downcasting.)
3.In Upcasting with Override we can access Overrided method or child class members.
4.In Upcasting with Interface with Override we can access threw reference type. which reference type 
  has given that member only access.[Ex: Here, santho m=new InterfaceMultiple(); we can access santho member only
  ,santho is interface]
*/


/*
Interface Types.
          1.Regular interface
		  2.Marker interface
		  3.Functional interface
		  
1.Regular Interface
  -----------------
 $ Which interface is having more than one abstract method that is called regular interface.
 
 Example:
        public interface santho{
		public void eat();
		public void run();
		public void jump();
		}
		
2.Marker Interface
  ----------------
 $ Which interface is don't have any abstract method that is called marker interface.
  (that means zero abstract methods.)
 $ Marker interface is mainly used to indicate JVM about certain activities.
 $ There are few marker interface in java namely:
                                              * Serializable
											  * Clonable
											  * Random Access
											  * Event Listener
3.Functional Interface
  --------------------
  $ Which interface is having only one abstract method that is called functional interface.
  
  Example:
         public interface comparable{
		 object compareTo(object o);
		 }
		 public interface comparator{
		 object compare(object 01,object 02)
		 }
		 public interface runnale{
		 void run();
		 }
											  
*/