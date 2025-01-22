//WAp to shift first element to last without using third variable.

import java.util.Arrays;
class SwapWithoutThirdVarible
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		a[0]+=a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]-=a[a.length-1];
		System.out.println(Arrays.toString(a));
	}
}
//[50, 20, 30, 40, 10]