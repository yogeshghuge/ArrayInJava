//WAP to swap First and last elements
//Input={10,20,30,40,50}
//Output={50,20,30,40,10}

import java.util.Arrays;
class SwapFirstAndLast
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int first=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=first;
		System.out.println(Arrays.toString(a));
	}
}	
		
			