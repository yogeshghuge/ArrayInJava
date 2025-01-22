//WAP to find max elements from array.
// Input:{25,18,358,124,467,127,234,79,12}
// Output=467

class MaxElementArray
{
	public static void main(String args[])
	{
		int a[]={25,18,358,124,467,127,234,79,12};
		//int max=0;
		int max=a[0];
		for(int i=0; i<a.length;i++)
			//max = Math.max(max, a[i]);
			//int max=a[0];
			if(max<a[i])
				max=a[i];
		System.out.print(max);
		
	}
}

			