import java.util.*;
class primeArraySum2
{
	public static void main(String []sp)
	{
		// Add only prime numbers in the array
		int a[]={2,3,4,5,6,7,8,9,19,20};
		int sum=0;
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==2)
			{
				sum+=a[i];
			}
			else{
				boolean p=true;
				for (int k=2;k<a[i];k++)
				{
					if (a[i]%k==0)
					{
						p=false;
						break;
					}
				}
				if (p)
				{
					sum+=a[i];
				}
			}
		}
		System.out.println(sum);
	}
}

/*
import java.util.*;

public class primeArraySum2
{
  public static void main(String[] args) {
      // Manoj bro >>>Adding prime numbers in array
     int arr[] = {5,4,5};
     int sum = 0;
     
     for(int i=0; i<arr.length;i++){
         if(arr[i] == 2){
             sum += 2;
            
         } else {
             int count = 1;
             for(int j=2; j<=arr[i];j++){
                 if(arr[i] % j == 0){
                     count++;
                 }
             }
             if(count == 2){
                 sum += arr[i];
             }
         }
     }
     System.out.println(sum);
     
  }
}
*/
























