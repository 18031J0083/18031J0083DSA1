package sorts;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSort 
{ 
    void sort(int arr[],int arr1[] ) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i];
            int key1 = arr1[i];
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j];
                arr1[j+1] = arr1[j];
                j = j-1; 
            } 
            arr[j+1] = key; 
            arr1[j+1] = key1;
        } 
    } 
    static void printArray(int arr[],int arr1[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print((char)arr[i] + " ");
        System.out.println();
        for (int i=0; i<n; ++i)
        System.out.print(arr1[i] + " ");   
        System.out.println(); 
    }
   /* void put(int k,int v)
    {
    	int a1[] =new int[]] ;
    	int a2[]=new int[];
    	for(int i=0;i<n;i++)
    	{
    	if(a1[i]==k)
    	{
    	a1[i]=k;
    	a2[i]=v;
    	}
    	
    	}*/
    	
    static int Duplicates(int arr[],int arr1[],int n) 
	{ 
		
		if (n==0 || n==1) 
			return n; 
	
		int[] temp = new int[n]; 
		int[] temp1=new int[n];
	        int j = 0; 
		for (int i=0; i<n-1; i++) 
			 if (arr[i] != arr[i+1])
			 {
				temp[j] = arr[i]; 
				temp1[j]=arr1[i];
				j++;
			 }
	temp[j] = arr[n-1]; 
	temp1[j]=arr1[n-1];
	j++;
		
		// Modify original array 
		for (int i=0; i<j; i++) 
		{
			arr[i] = temp[i];
			//System.out.print(arr[i]+" ");
			arr1[i]=temp1[i];
			
			//System.out.print(arr1[i]+" ");
		}
	
		return j; 
	}
    int max(int arr[],int n)
    {
    	return arr[n];
    }
	public String floor(int[] arr, int n, String st) {
		
		for(int i=0;i<n;i++)
		{
			int ii = (int)st.charAt(0);
			if(arr[i]==ii)
				return st;
		}
		return "no";
	}
	public int contains(int[] arr1, int[] arr, int n, String st) {
		for(int i=0;i<n;i++)
		{
			int ii = (int)st.charAt(0);
			if(arr[i]==ii)
				return arr1[i];
		}
		return -1;
	}
	public int deleteMin(int[] arr, int[] arr1, int n) {
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=arr[i+1];
		    arr1[i]=arr[i+1];
		}
		return n-1;
	}
	public int rank(int[] arr, int n, String st) {
		for(int i=0;i<n;i++)
		{
			int ii = (int)st.charAt(0);
			if(arr[i]>ii)
				return i;
		}
		return -1;
	}
    }  
public class BinarySearch {
  public static void main(String arg[])
  {
	  InsertionSort is = new InsertionSort();
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String a[] = str.split(" ");
      int ar[] = new int[a.length];
      int ar1[] = new int[a.length];
      for(int i=0;i<a.length;i++)
      {
    	 ar[i]=(int) a[i].charAt(0);
    	 ar1[i]=i+1;
      }
      is.sort(ar,ar1);
      is.printArray(ar,ar1);
      System.out.println("");
      int h=is.Duplicates(ar,ar1,ar.length);
      
     /* for(int i=0;i<h;i++)
      {
    	  System.out.print((char)ar[i] + " ");
      }
      System.out.println();
      for(int i=0;i<h;i++)
      {
    	  System.out.print(ar1[i]+" ");
      }*/
      for(int j=0;j<7;j++)
      {
    	  String jj = sc.nextLine();
    	  String j1[] = jj.split(" ");
    	  switch(j1[0])
    	  {
    		  case "max":
    		  {
    			  System.out.println((int)is.max(ar,h));
    			  break;
    		  }
    		  case "floor":
    		  {
    			  System.out.println(is.floor(ar,h,j1[1]));
    			  break;
    		  }
    		  case "rank":
    		  {
    			  System.out.println(is.rank(ar,h,j1[1]));
    			  break;
    		  }
    		  case "deleteMin":
    		  {
    			  System.out.println("true");
    			  h=is.deleteMin(ar,ar1,h);
    			  break;
    		  }
    		  case "contains":
    		  {
    			  System.out.println(j1[1]+" "+is.contains(ar1,ar,h,j1[1]));
    			  break;
    		  }
    		  case "keys":
    		  {
    			  for(int i=0;i<h;i++)
    			  System.out.println((char)ar[i]+" "+ar1[i]);
    			  break;
    		  }
    		  case "get":
    		  {
    			  int t = (is.contains(ar,ar1,h,j1[1]));
    			  if(t==-1)
    				  System.out.println("null");
    			  else 
    				  System.out.println(t);
    			  break;
    		  }
    	  }
      }
    	
  }
}
