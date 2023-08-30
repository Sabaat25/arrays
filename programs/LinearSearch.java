

import java.util.Scanner;

public class LinearSearch { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a Size"); 
		int size=sc.nextInt(); 
		int arr[]=new int[size]; 
		
		for(int i=0;i<size;i++) { 
			arr[i]=sc.nextInt(); 
		}  
		System.out.println("Enter a Num to find");
		int x=sc.nextInt(); 
		for(int i=0;i<arr.length;i++) { 
			if(x==arr[i]) { 
				System.out.println("Num Found at index"+" "+i);
			}
		}
	}

}
