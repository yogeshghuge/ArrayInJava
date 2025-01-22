//WAP to add sum of digit at the end of elements.
// Input: {25,18,358,124,467,127,234,79,12}
// Output: {257,189,35816,1247,46717,12710,2349,7916,123}

class SumOfDigitATEndArray
{
	public static void main(String args[])
	{
		int a[]={25,18,358,124,467,127,234,79,12};
		for(int i=0; i<a.length;i++)
		{
			int sum=0;
			int n=a[i];
			while(n>0)
			{
				sum+=n%10;
				n/=10;	
			}
			int t=sum;
			int c=0;
			while(t>0)
			{
				t/=10;
				c++;	
			}
			a[i]*=Math.pow(10,c); 
			a[i]+=sum; 
			System.out.print(a[i]+" ");
		}
		
	}
}

