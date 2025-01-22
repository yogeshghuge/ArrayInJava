// WAP to reverse each elements from array
// Input: {25,18,358,124,467,127,234,79,12}
// Output: {52, 81,853,421,764,721,432,97,21}

class ReverseOfArray
{
	public static void main(String args[])
	{
		int a[]={25,18,358,124,467,127,234,79,12};
		int rev=0;
		for(int i=0;i<a.length;i++)
		{	
			int n=a[i];
			while(n>0)
			{
				//rev=rev+n*10;
				rev=n%10;
				rev=rev+n*10;
				n=n/10;
				//System.out.print(rev);
			}
			System.out.print(rev+" ");
		}
	}
}
		