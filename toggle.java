package coreJava;
import java.util.*;
public class toggle {
	public static void main (String[]args)
	  {
	    Scanner sc = new Scanner(System.in);
	    
	    String str = sc.nextLine();
	    
	    String ans = "";
	    
	    for(int i = 0; i < str.length(); i++)
	    {
	        if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
	        {
	            ans += (char)(str.charAt(i) - 32);
	        }
	        else if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
	        {
	            ans += (char)(str.charAt(i) + 32);
	        }
	    }
	    
	    for(int i = 0; i < ans.length() ; i++)
	    {
	        System.out.print(ans.charAt(i));
	    }
	    
	  }
}
