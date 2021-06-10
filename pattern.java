package coreJava;

public class pattern{
	static void printTopOrBottomline(int size) {
		System.out.print("+");
		for(int i=0; i<2*size; i++)
			System.out.print("-");
		System.out.println("+");
	}
	static void printMiddleline(int size) {
		System.out.print("|");
		System.out.print("<");
		
		for(int i =0; i<2*size-2; i++) {
			if(size%2==0)
				System.out.print("-");
			else
				System.out.print("=");
		}
		System.out.print(">");
		System.out.println("|");
	}
	
	static void printUpperHalf(int size){
		for(int row=0; row<size-1; row++) {
			System.out.print("|");
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			
			for(int i =0; i<2*row; i++) {
				if(row%2==0)
					System.out.print("=");
				else
					System.out.print("-");
			}
		
			System.out.print("\\");
			
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			
		}
	}
	static void printLowerHalf(int size) {
		for(int row=size-2; row>=0; row--) {
			System.out.print("|");
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			
			for(int i=0; i<2*row;i++) {
				if(row%2==0)
					System.out.print("=");
				else
					System.out.print("-");
			}
		
			System.out.print("/");
			
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			
		}
		
	}
	static void printPattern(int size) {
		printTopOrBottomline(size);
		printUpperHalf(size);
		printMiddleline(size);
	    printLowerHalf(size);
		printTopOrBottomline(size);
		
	}
	
	public static void main(String[] args) {
    printPattern(1);
    System.out.println();
	printPattern(2);
	System.out.println();
	printPattern(4);
	System.out.println();
	printPattern(7);
}
}
