

import java.util.Scanner;

public class StringArray { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a Size");
		int size=sc.nextInt();  
		System.out.println("Enter a String");
		String arr[]=new String[size]; 
		
		for(int i=0;i<size;i++) { 
			arr[i]=sc.next();
		} 
		
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}
	}
}
