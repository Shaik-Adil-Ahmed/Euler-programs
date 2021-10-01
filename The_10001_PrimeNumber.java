package myhcl;

public class The_10001_PrimeNumber {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
		    int count = 1;
		    for (int i=3; ;i++)
		    {
		      if(IsPrime(i)) 
		    	  {
		    	  count++;
		    	  }
		            
		      if(count == 10001)
		      {
		        System.out.println(i);
		        break;
		      }
		    }
		}
	

		public static boolean IsPrime(int n) 
		{
			if(n%2==0)
				{
				return false;
				}
			  else
			  {
			    for(int i=3; i<= Math.sqrt(n); i+=2)
			    {
			      if(n%i==0)
			    	  {
			    	  return false;
			    	  }
			    }
			  }
			  return true;
			}

		}
		    
