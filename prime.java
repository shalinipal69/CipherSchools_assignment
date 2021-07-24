package coreJava;
import java.util.*;

public class prime {
	
	
	  static boolean isPrime(int n)
	  {
	    for(int i = 2; i*i <= n; i++)
	    {
	        if(n%i == 0)
	        {
	            return false;
	        }
	    }
	    
	    return true;
	  }
	  
	  public static void main (String[]args)
	  {
	    Scanner sc = new Scanner(System.in);
	    
	    int l = sc.nextInt();
	    int r = sc.nextInt();
	    
	    for(int i = l; i <= r; i++)
	    {
	        if(isPrime(i))
	        {
	            System.out.println(i);
	        }
	    }
	    
	  
	}
}
