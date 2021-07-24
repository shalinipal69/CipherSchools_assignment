package coreJava;
import java.util.*;
public class patternnew {
	
	
	
		public static void pattern(String[] args) 
		{
			
			Scanner sc= new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
			    for(int j=1;j<=n-i;j++)
			    {
			        System.out.print(" \t");
			    }
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print("*\t");
			    }
			    
			    System.out.print("\n");
			}
			
		
	}
	}
