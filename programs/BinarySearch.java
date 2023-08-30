

public class BinarySearch { 
	public static void binarySearch(int arr[],int key) { 
		int low=0; 
		int high=arr.length-1; 
		while(low<=high) { 
			int mid=(low+high)/2; 
			if(arr[mid]==key) { 
				System.out.println("Element Found at Index "+mid);
			break;
			} 
			else 
				if(arr[mid]>key) { 
					high=mid-1;
				} 
				else 
					if(arr[mid]<key) { 
						low=mid+1;
					} 
		}  
		if(low>high) {
		System.out.println("Element Not Found"); 
		}
	}  
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public static void main(String[] args) {
		int arr[]= {25,01,06,70,07};  
		printArray(arr);
		binarySearch(arr, 06);  
	}
}

