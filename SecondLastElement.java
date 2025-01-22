//WAP to find second max element from array.
class SecondLastElement
{
	public static void main(String args[])
	{
		int a[]={725,18,358,124,467,127,234,79,12,467,358};
		int max=a[0];
		int smax=0;
		for(int i=1; i<a.length;i++)
		{
			if(max<a[i])
			{
				smax=max;
				max=a[i];
			}
			if(smax<a[i] && a[i]!=max)
				smax=a[i];
		}
		System.out.println(max);
		System.out.println(smax);
	}
}