package myhcl;
import java.util.*;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int max_product=0;
		for(int i=999;i>=100;i--)
		{
			
		for(int j=i;j>=100;j--)
		{
			
			int product = i*j;
			int temp=product;
			int reverse=0;
		
			while(temp!=0)
			{
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
			}
		
			if(product == reverse && product>max_product)
			{
				max_product = product;
			}
		}

		}
		System.out.println("largest palindrome for product of 2 three digit numbers is : "+max_product);

		

	}

}
