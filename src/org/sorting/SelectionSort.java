package org.sorting;


public class SelectionSort {

	
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
	
	public static void main(String[] args) {
		System.err.println("hello U !");
		
		
		SelectionSort sort = new SelectionSort();
		
		
		
		int arr[] = {4,1,3,9,7};
		sort.selectionSort(arr);
		
	//	sort.select(arr);
		System.out.println("Sorted array");
		sort.printArray(arr);

	}
	
	
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	
	int select(int arr[]){
		System.err.println("start of selection sort .... ");
		
		
		int n = arr.length;
		
		// One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            printArray(arr);
        }
		
		System.err.println("start of selection sort .... ");
		return 0;
	}
	
}

class GfG
{
    int  select(int ar[], int i)
    {
	// Your code here
	int max = ar[i], k = i;
	for(int j = i - 1; j >=0; j--)
	{
	    if(ar[j] > max)
	    {
	        max = ar[j];
	        k = j;
	    }
	}
	return k;
    }
}
