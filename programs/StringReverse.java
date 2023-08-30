

import java.util.Scanner;

public class StringReverse { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter A Number");
		int size=sc.nextInt(); 
		String arr[]=new String[size]; 
		System.out.println("Enter A String");
		for(int i=0;i<size;i++) { 
			arr[i]=sc.next();
		} 
		
		for(int i=arr.length-1;i>=0;i--) { 
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
