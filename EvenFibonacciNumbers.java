package myhcl;

public class EvenFibonacciNumbers {
	public static void main(String...args)
	{
		int a=1;
		int b=2;
		int c=a+b;
		int sum=2;
		for(int i=1;c<4000000;i++)
		{
			a=b;
			b=c;
			c=a+b;
			if(c%2==0)
			{
				sum=sum+c;
			}
			
		}
		System.out.println(sum);
	}


}




