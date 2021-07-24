package coreJava;
import java.util.Scanner;


public class armstrong {
	 int power(int x, long y)
	    {
	        if( y == 0)
	            return 1;
	        if (y%2 == 0)
	            return power(x, y/2)*power(x, y/2);
	        return x*power(x, y/2)*power(x, y/2);
	    }
	 int order(int x)
	    {
	        int n = 0;
	        while (x != 0)
	        {
	            n++;
	            x = x/10;
	        }
	        return n;
	    }
	 boolean isArmstrong (int x)
	    {
	        // Calling order function
	        int n = order(x);
	        int temp=x, sum=0;
	        while (temp!=0)
	        {
	            int r = temp%10;
	            sum = sum + power(r,n);
	            temp = temp/10;
	        }
	 
	        // If satisfies Armstrong condition
	        return (sum == x);
	    }
	 public static void main(String[] args)
	    {
	        armstrong ob = new armstrong();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number to check if it is Armstrong number or not:");
	        int x=sc.nextInt();
	       
	        if(ob.isArmstrong(x))
	            System.out.println("Yes ");
	        else
	            System.out.println("No");
}
}
