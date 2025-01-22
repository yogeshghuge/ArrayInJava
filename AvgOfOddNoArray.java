class AvgOfOddNoArray
{
	public static void main(String args[])
	{
		int a[]={10,50,56,87,89,63,69,45,56,98};
		int oddNo=0;
		double avg=0;
		for(int i=0; i<a.length; i++)
			if(a[i]%2!=0)
			{
				avg+=a[i];
				oddNo++;
			}
			avg/=oddNo;
			System.out.println("Average of odd Array="+avg);
	}
}