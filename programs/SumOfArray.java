

import java.util.Scanner;

public class SumOfArray { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter The Size:");
		int size=sc.nextInt(); 
		int arr[]=new int[size]; 
		
		System.out.println("Enter a Number");
		for(int i=0;i<size;i++) { 
			arr[i]=sc.nextInt();
		} 
		int sum=0;
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
			sum=sum+arr[i]; 
			
		} 
		System.out.println("\n"+"Sum of an Array is: "+sum);
	}

}
