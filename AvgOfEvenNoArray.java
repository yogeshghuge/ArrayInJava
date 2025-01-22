class AvgOfEvenNoArray
{
	public static void main(String args[])
	{
		int a[]={50,46,55,89,98,78,76,66,38,92,91,95};
		int EvenNo=0;
		double avg=0;
		for(int i=0; i<a.length;i++)
			if(a[i]%2==0)
			{
				avg+=a[i];
				EvenNo++;
			}
			avg/=EvenNo;
			System.out.println("Average of Even No="+avg);
	}
}
		
	