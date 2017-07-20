package org.searching;

public class JumpSearch {

	
	public static int jumpSearch(int arr[], int n ,int x) {
		
		
		 // Finding block size to be jumped
		int step = (int)Math.floor(Math.sqrt(n));
		
		System.err.println( step );
		
		// Finding the block where element is
        // present (if it is present)
		int prev = 0;
		while(arr[Math.min(step , n)-1] < x) {
			
			System.err.println( arr[Math.min(step , n)-1] );
			prev = step ;
			step += (int)Math.floor(Math.sqrt(n));
			if (prev >= n)
                return -1;
		}
		
		
        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x)
        {
            prev++;
 
            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
        
        
        // If element is found
        if (arr[prev] == x)
            return prev;
		
		return -1;
	}
	
	
	
    public static void main(String [ ] args)
    {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                     34, 55, 89, 144, 233, 377, 610};
        int x = 89;
 
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr,arr.length , x);
 
        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                            " is at index " + index);
    }
}
