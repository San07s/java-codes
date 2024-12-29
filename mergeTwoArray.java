import java.util.*;
class mergeTwoArray
{
	public static int[]method(int a[],int b[])
	{
		int merge[]=new int[a.length+b.length];
		for (int i=0,m=0,n=0;i<merge.length;i++)
		{
			if (m<a.length)
			{
				merge[i]=a[m++];
			}
			else if (n<b.length)
			{
				merge[i]=b[n++];
			}
		}
		System.out.println(Arrays.toString(merge));

		return merge;
	}
	public static void main(String []sp)
	{
		int x[]={1,2,3,4,5,9};
		System.out.println(Arrays.toString(x));
		int y[]={6,7,8,9,10};
		System.out.println(Arrays.toString(y));
		method(x,y);
	}
}


/*
Merge 2d Array 

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int a[][] = {
	        {1,2,3,},
	        {10,11,12},
	        {20,21,23}
	    };
	    
	    int b[][] = {
	        {6,7,8},
	        {15,16,17},
	        {25,26,27}
	    };
	    
	    int merge[][] = new int[a.length][a.length+a.length];
	    
	    for (int i=0;i<a.length; i++ ){
	        for(int j=0,n=0,m=0; j<a[i].length+b[i].length;j++){
	            if(m < a[i].length){
	                merge[i][j] = a[i][m++];
	                   
	            } else if( n < b[i].length){
	                merge[i][j] = b[i][n++];
	            }
	            
	        }
	    } 
	    
		System.out.println(Arrays.toString(merge[0]));
		System.out.println(Arrays.toString(merge[1]));
		System.out.println(Arrays.toString(merge[2]));
	}
}


*/