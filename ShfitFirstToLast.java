//WAP to shfit first element to last
// Input={10,20,30,40,50}
// Output={20,30,40,50,10}

import java.util.Arrays;
class ShfitFirstToLast
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		 int first=a[0];
		for(int i=1; i<a.length;i++)
		            a[i-1]=a[i];
       		a[a.length-1] = first;
		System.out.println(Arrays.toString(a));
	}
}
//[20, 30, 40, 50, 10]	