/*import java
class xylemandphloem 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
*/

/*
import java.util.Scanner;

public class xylemandphloem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find the last digit
        int lastDigit = number % 10;
        
        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        // Sum of first and last digit
        int sumFirstLast = firstDigit + lastDigit;
        
        // Calculate sum of the middle digits
        int middleSum = 0;
        int tempNumber = number / 10; // Remove last digit
        
        while (tempNumber >= 10) {
            int middleDigit = tempNumber % 10; // Extract middle digit
            middleSum += middleDigit;
            tempNumber /= 10; // Remove this digit
        }
        
        // Compare sums and print result
        if (sumFirstLast == middleSum) {
            System.out.println("santhosh");
        } else {
            System.out.println("pushpalatha");
        }
        
        scanner.close();
    }
}*/


/*
import java.util.Scanner;
class xylemandphloem
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.println("Enter Your Number");
		int num=s.nextInt();
		int last=num%10;
		int first=0;
		while (9<num)
		{
			first=num/10;
		}
		int sum=first+last;
		
	}
}*/











import java.util.Scanner;
class xylemandphloem
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)
	{
		System.out.print("Enter your Number:");
		int num=s.nextInt();
		
		int temp=num;
		int last=num%10;
		int tsum = 0;
		
		while (num>9)
		{
			tsum=tsum+(num%10);
			num=num/10;
		}
		
		tsum=tsum+num;
		int msum=tsum-(num+last);
		if (msum == (num+last))
		{
			System.out.println("xylem");
		}
		else 
		{
			System.out.println("phloem");
		}
		
	}
		
}





















