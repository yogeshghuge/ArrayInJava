//WAP to shift last element to first without using third variable.
// Input={10,20,30,40,50}
// Output={50, 10, 20, 30, 40}
import java.util.Arrays;
class LastToFirstWithoutThirdVar
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		for (int i=a.length-1;i>0;i--) 
		{
            		a[i]+=a[i-1];
            		a[i-1]=a[i] - a[i-1];
            		a[i]-= a[i-1];
        	}
		System.out.println(Arrays.toString(a));
	}
}
//50, 10, 20, 30, 40
