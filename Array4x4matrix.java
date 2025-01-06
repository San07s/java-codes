/*
This Program is 4x4 Matrix program Manually user enter value ans printing...s
*/

import java.util.*;
class Array4x4matrix
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)throws Exception
	{
		int a[][]=new int[4][4];
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("*******************");
        System.out.println("Starts...");

		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(1000);
			}
			System.out.println();
		}
		System.out.println("Thank You..!");
	}

}