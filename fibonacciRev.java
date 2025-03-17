import java.util.Scanner;
class fibonacciRev 
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		int first=0,second=1;
		String ans="";
		for (int i=1;i<=num;i++)
		{
			System.out.print(first+" ");
			ans+=first+" ";
			int next=first+second;
			first=second;
			second=next;
		}
		method(ans);
	}
	public static void method(String a){
			String rev="";
			for (int i=a.length()-1;i>=0;i--)
			{
				rev+=a.charAt(i);
			}
			System.out.println(rev);
		}
}