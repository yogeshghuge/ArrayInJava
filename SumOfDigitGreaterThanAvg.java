//WAP to find sum of elements which is greater than avg. of array.

class SumOfDigitGreaterThanAvg
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		double avg=0,sum=0;
		
		for(int i=0; i<a.length;i++)
			avg+=a[i];
	
		avg/=a.length;
		for(int i=0; i<a.length;i++)
			if(a[i]>avg)
				sum+=a[i];	
		System.out.println("sum of elements which is greater than Average is="+sum);
	}
}	
