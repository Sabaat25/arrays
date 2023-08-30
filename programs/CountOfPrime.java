

public class CountOfPrime {  
	public static void main(String args[]){
	    int a[]={1,5,3};
	    for(int i=0; i<=a.length-1; i++)
	    {
	        System.out.print(a[i]);
	    } 
	    System.out.println("");
	    for(int i=0; i<=a.length-1; i++)
	    {
	        int c=0;
	        for(int j=1; j<=a[i]; j++)
	        {
	            if(a[i]%j==0)
	            {
	                c++;
	            }
	        }
	        if(c==2)
	        {
	            System.out.print("Prime Num In Array Are "+a[i]+" ");
	        }
	    }
	} 
}