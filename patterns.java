package coreJava;


public class patterns{
	
	public static void main(String[] args) {

		int row=4;
		
for(int i=0; i<row; i++)   
{   
for(int j=0; j<=i; j++)   
{   
System.out.print("*");   
}   
System.out.println();   
}
System.out.println();
System.out.println();

// for downward 2.

int rows=4;        
for (int i= rows-1; i>=0 ; i--)  
{  
 
for (int j=0; j<=i; j++)  
{  

System.out.print("*");  
}  
  
System.out.println();  
}  
System.out.println(); 
System.out.println();

//3. 

int size=4;
         
for (int i= 0; i<= size-1; i++)  
{  
for (int j=0; j<=i; j++)   
{  
System.out.print("*");  
}   
System.out.println();   
}   
for (int i=size-1; i>=0; i--)  
{  
for(int j=0; j <= i-1;j++)  
{  
System.out.print("*");  
}  
System.out.println();  
}
System.out.println();
System.out.println();

//4.

int n=4;   
for (int i= 0; i<= n; i++)  
{    
for (int j=1; j<=n-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print("*");  
}   
System.out.println("");  
}  

System.out.println("");
System.out.println("");

//5.

int s = 4;       
for (int i=0; i<s; i++)   
{        
for (int j=s-i; j>1; j--)   
{   
System.out.print(" "); 
}   
for (int j=0; j<=i; j++ )   
{       
System.out.print("* ");   
}    
System.out.println();   
}   

System.out.println();
System.out.println();

//6.


for (int q=1;q<=4;q++) 
{
for (int v=1;v<=q;v++)
{
System.out.print(v);
}
System.out.println();
}
System.out.println();
System.out.println();

//7.

int z=1;
for (int y=1; y<=5; y++)
{
for (int x=1;x<=y;x++)
{ System.out.print(z+" ");
z++;
}
System.out.println();
}


}
}	
