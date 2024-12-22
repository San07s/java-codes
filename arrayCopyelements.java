import java.util.Arrays;
class arrayCopyelements 
{
	public static int[] san(int []a)
	{
		int result[]=new int[a.length];
		for (int i=0;i<a.length;i++)
		{
			result[i]=a[i];
		}
		return result;
	}
	public static void main(String []sp)
	{
		int x[]={1,2,3,4,5};
		System.out.println(Arrays.toString(x));
		int res[]=san(x);
		System.out.println(Arrays.toString(res));
	}
}




















