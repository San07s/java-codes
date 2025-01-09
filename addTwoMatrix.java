// This is Add to arrays program

class addTwoMatrix
{
	public static void main(String []sp)
	{
		int a[][]={
			{10,20,10},
			{40,18,10},
			{14,12,80}
		};
		int b[][]={
			{23,44,63},
			{41,54,23},
			{71,24,15}
		};
		
		int add[][]=new int[3][3];
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
		
}