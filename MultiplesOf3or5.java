package myhcl;
import java.util.*;
public class MultiplesOf3or5 {
	public static void main(String...args)
	{
		int n;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'n' value:");
		n = sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
				
			}
		}
		
		System.out.println("Sum is:"+sum);
		
		
		
	}
	
	

}
