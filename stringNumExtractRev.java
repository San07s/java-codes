/*
This is extract numbers from string and reverse.
input: ab23cd8ef64gh938i237
output:ab32cd8ef46gh839i732

here reverse only numbers.

*/

class stringNumExtractRev
{
	public static String method(String x)
	{
		char a[]=x.toCharArray();
		String ans="";
		String num="";
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0' && a[i]<='9')
			{
				num+=a[i];// here adding only consecutive numbers together
			}
			else{
				ans+=reverse(num);// then calling reverse method and reverse the number and add it.
				num="";// then empty the num container.because store next consecutive number.
				ans+=a[i];// add only alphabets 
			}
		}
		ans+=reverse(num);      //above else condition only work alphabets, so if have number at last,that number  
		System.out.println(ans);// can't reverse and add,so that reason for 21th line,
		return ans;             // here last consecutive number reverse and store.
	}
	public static String reverse(String s)
	{
		String rev="";
		for (int i=s.length()-1;i>=0;i--)// this loop is reverse the numbers
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	public static void main(String []sp)
	{
		String s="ab23cd8ef64gh938i237";
		method(s);
	}
}