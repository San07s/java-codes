import java.util.*;
class convertOne
{
	public static void main(String []sp)
	{
		int num=123;
		String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		int arr=num.toCharArray();
		
		//String numStr=String.valueOf(num);
		int res[]=new int[arr.length];
		
		for (int i=0;i<num.length;i++)
		{
			int digit=num.charAt(i)-'0';
			res[i]=a[num.charAt(i)];
		}
		System.out.println(Arrays.toString(res));
	}
}