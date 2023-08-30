

import java.util.Scanner;

public class PrintingNum { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter A Number");
		int size=sc.nextInt(); 
		int arr[]=new int[size]; 
		for(int i=0; i<size; i++) {
	           arr[i] = sc.nextInt();
	       }
	       //print the numbers in array
	       for(int i=arr.length; i<=0; i--) {
	           System.out.print(arr[i]+" ");
	       }
	   }
	}
