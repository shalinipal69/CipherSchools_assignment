package coreJava;
import java.util.*;
public class element
{
  static int lowerBound(int arr[], int key, int n)
  {
    int low = 0, high = n - 1, res = -1;
    
    while (low <= high)
    {

	    int mid = (low + high) / 2;
	    
	    if (arr[mid] > key)
	    {
	        high = mid - 1;
	    }
	    else if (arr[mid] < key)
	    {    
	        low = mid + 1;
	    }
        else
	    {
	        res = mid;
	        high = mid - 1;
	    }
    }
    
    return res;
  }
  
  
  static int upperBound(int arr[], int key, int n)
  {
    int low = 0, high = n - 1, res = -1;
    
    while (low <= high)
    {
	    int mid = (low + high) / 2;
    	
    	if (arr[mid] > key)
	    {    
	        high = mid - 1;
	    }
	    else if (arr[mid] < key)
	    {     
	        low = mid + 1;
	    }
	    else
	    {
	        res = mid;
	        low = mid + 1;
	    }
    }
    
    return res;
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    for(int i = 0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    
    int key = sc.nextInt();
    
    System.out.println ("Lower Bound = " + lowerBound(arr, key, n));
    System.out.println ("Upper Bound = " + upperBound(arr, key, n));
  }
}