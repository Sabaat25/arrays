

import java.util.Scanner;

public class ReverseOfAnArray { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a size");
		int size=sc.nextInt(); 
		int arr[]=new int[size]; 
		
		System.out.println("Enter a Number"); 
		for(int i=0;i<size;i++) { 
			arr[i]=sc.nextInt();
		}   
		for(int i=arr.length-1;i>=0;i--) { 
			System.out.print("Reverse of an Array is"+arr[i]+" ");
		}
	}

}
