class AvgOfAllArray
{
	public static void main(String args[])
	{
		int a[]={10,50,56,87,89,63,69,45,56,98};
		double avg=0;
		for(int i=0; i<a.length;i++)
		{
			avg+=a[i];
		}
		avg/=a.length;
		System.out.println("Average of Array="+avg);
	}
}