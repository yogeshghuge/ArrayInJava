//WAP to shift last element to first
//Input={10,20,30,40,50}
//Output={50,10,20,30,40}

import java.util.Arrays;
class ShiftLastToFirst
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int last=a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=last;
		System.out.println(Arrays.toString(a));
	}
}

		
		