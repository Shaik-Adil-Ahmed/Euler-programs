package myhcl;
import java.lang.*;

public class Pythagorean_triplet 
{
	public static void main(String...args)
	{
		
		
		
		
		
		for (int n = 1; n < 500; n++)
		{
            for (int m = (n + 1); m < 500; m ++)
            {
                int a = (m * m) - (n * n);
                int b = 2 * m * n;
                int c = (m * m) + (n * n);
                if (a + b + c == 1000) 
                {
                    int product = a * b * c;
                    System.out.println(product);
                    
                    
        /*for (int a = 3; a <= 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                
                double cSquare = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.sqrt(cSquare);
                
                if (a + b + c == 1000) {
                    System.out.println(a * b * c);   */          
                }
                 
            }   
        }   
    }
}