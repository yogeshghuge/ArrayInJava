class AvgOfEvenAndOddNo
{
	public static void main(String args[])
	{
		int a[]={50,46,55,89,98,78,76,66,38,92,91,95};
		int even=0;
		double AvgOdd=0,AvgEven=0;
		for(int i=0; i<a.length;i++)
			if(a[i]%2==0)
			{
				AvgEven+=a[i];
				even++;
			}
			else
			{
				AvgOdd+=a[i];
			}
			AvgEven/=even;
			AvgOdd/=a.length-even;
			System.out.println("Average of Even no is="+AvgEven);
			System.out.println("Average of odd no is="+AvgOdd);
	}
}
/*
Average of Even no is=68.0
Average of odd no is=82.5
*/


		