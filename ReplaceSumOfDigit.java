// WAP to replace each elements with their sum of digits. 
//Input= {123,3246,325}
// Output= {6,15,10}

class ReplaceSumOfDigit
{
	public static void main(String args[])
	{
		int a[]={123,3246,325};
		for(int i=0; i<a.length;i++)
		{
			int sum=0;
			int n=a[i];
			while(n>0)
			{
                		sum+=n%10;
                		n/=10;
            		}
			System.out.print(sum+" ");
		}
	}
}