//itarative
import java.io.*;
import java.util.*;


public class Search {
	
	public void binary_search(int element, int array[], int size)
	{
		//int size;
		int low = 0, high = size-1, mid;
	  
	  while (low < high)
	  {
	    mid = (low + high)/2;
	    if(element == array[mid])
	    {
	      mid=mid+1;
	      System.out.println("Element is found at position "+ mid);
	      return;
	    }
	    else if(element < array[mid]) 
	    	high = mid;
	    else 
	    	low = mid + 1;
	  }
	  System.out.println("\nThe number is not present in array");
	}
	
	int [] sort(int array[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
				
			}
		}
		return array;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,search,array[];
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Number of elements :");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter "+n+" integer");
		
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		
		Search s=new Search();
		s.sort(array, n);
		System.out.println("Sorted Array is : ");
		for (int i=0;i<n;i++)
			System.out.println(array[i]);
		System.out.println("Enter value to be serach");
		search=in.nextInt();
		s.binary_search(search, array, n);
		

		
	}

}


/*output
 * Enter Number of elements :
10
Enter 10 integer
2
6
15
89
35
12
38
47
65
73
Sorted Array is : 
2
6
12
15
35
38
47
65
73
89
Enter value to be serach
47
Element is found at position 7
*/
