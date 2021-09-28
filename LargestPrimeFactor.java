package myhcl;
import java.util.*;

public class LargestPrimeFactor 
{
	public static void main(String...args)
	{
		long n;
		System.out.println("Enter 'n' value : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		long x = n;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				n=n/i;
				x=i;
			}
		}
		System.out.println(x);
		
	}


}
