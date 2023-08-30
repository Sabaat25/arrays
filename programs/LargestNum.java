
import java.util.Scanner;

public class LargestNum { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter A Size"); 
		int size=sc.nextInt(); 
		int arr[]=new int[size]; 		
		System.out.println("Enter a Number"); 
		for(int i=0;i<size;i++) { 
			arr[i]=sc.nextInt();
		}  
		int largest=arr[0];
		for(int i=1;i<=arr.length-1;i++) {   
			if(largest<arr[i]) { 
				largest=arr[i];
			}
		} 
		System.out.println("Largest No is: "+largest);
	}
}
