/*
This program is : If you are giving like this  input:1234
                                                   then
												 add each number like 1+2+3+4=10
												                          1+0=1
																		
														Until get single digit.				


*/

class OneDigitNum
{
	public static void main(String []sp)
	{
		int num=1234567;
		int sum=0;
		while (num>0)
		{
			sum+=num%10;
			num=num/10;
			if (num==0)
			{
				if (sum>=0 && sum<=9)
				{
					System.out.println(sum+":Single Digit value");
				}
				else{
					num=sum;
					sum=0;
				}
			}
		}
	}
}