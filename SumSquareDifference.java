package myhcl;

public class SumSquareDifference {
	public static void main(String...args)
	{
		long square = 0;
		for(int i=1;i<=100;i++)
		{
			square = square+(i*i);
		}
		long sum=0;
		for(int i=1;i<=100;i++)
		{
			sum = sum+i;
			
		}
		sum=sum*sum;
		
		System.out.println(sum-square);
		
	}
}
