import java.util.*;
class myPrime
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Number:");
		int num=s.nextInt();
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			  System.out.println(num+":Not Prime");
			  return;
			}
		}
		System.out.println(num+":Prime");
		
		
	}

}