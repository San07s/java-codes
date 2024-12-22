import java.util.*;
/*class MultiDimentionalArray
{
	public static void main(String []sp)
	{
		int s[][]={
			{11,22,33,44,55},
			{66,77,88,99,10},
			{11,12,13,14,15},
			{16,17,18,19,20}
		};
		//right to left and up to down
		/*for (int i=0;i<s.length;i++)
		{
			for (int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		for (int i=s.length-1;i>=0;i--)
		{
			for (int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}//
	

	}
} */

//>>> this are all already know so, focus 
class MultiDimentionalArray
{
	public static void main(String []sp)
	{
		int a[][]={
			{11,22,33,44,55},
			{66,77,88,99,00},
			{10,20,30,40,50},
			{60,70,80,90,01},
		};
			for (int i=0;i<a.length;i++)
			{
				//left to right and top to bottom 
				for (int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("*******************");
			System.out.println();
			for (int i=0;i<a.length;i++)
			{
				for (int j=a[i].length-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("*******************");
			System.out.println();
			for (int i=a.length-1;i>=0;i--)
			{
				for (int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		    System.out.println();
			System.out.println("*******************");
			System.out.println();
			for (int i=a.length-1;i>=0;i--)
			{
				for (int j=a[i].length-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
	}
			
}





















