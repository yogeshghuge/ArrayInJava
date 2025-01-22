//WAP to find sum of digit at the first
// Input:{25,18,358,124,467,127,234,79,12}
// Output={725,918,16358,7124,17467,10127,9234,1679,312}

import java.util.Arrays;
class SumAtFirstArray
{
	public static void main(String args[])
	{
		int a[]={25,18,358,124,467,127,234,79,12};
	
		for(int i=0; i<a.length;i++)
		{
			int sum=0,temp=a[i],count=0;
			while(temp>0)
			{
				sum+=temp%10;
				temp/=10;
				count++;
			}
			sum*=Math.pow(10,count);
			sum+=a[i];
			a[i]=sum;
			//System.out.print(sum+" ");
		}
		System.out.println(Arrays.toString(a));
	}
}
//[725, 918, 16358, 7124, 17467, 10127, 9234, 1679, 312]
		
