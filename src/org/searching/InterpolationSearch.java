package org.searching;



//The idea of formula is to return higher value of pos
//when element to be searched is closer to arr[hi]. And
//smaller value when closer to arr[lo]
//pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
//
//arr[] ==> Array where elements need to be searched
//x     ==> Element to be searched
//lo    ==> Starting index in arr[]
//hi    ==> Ending index in arr[]
//		
public class InterpolationSearch {

	
	
	
    // Array of items on which search will
    // be conducted.
    static int arr[] =  { 0, 1, 1, 2, 3, 5, 8, 13, 21,
        34, 55, 89, 144, 233, 377, 610};
     
    // If x is present in arr[0..n-1], then returns
    // index of it, else returns -1.
//    static int interpolationSearch(int x)
//    {
//        // Find indexes of two corners
//        int lo = 0, hi = (arr.length - 1);
//      
//        // Since array is sorted, an element present
//        // in array must be in range defined by corner
//        while (lo <= hi && x >= arr[lo] && x <= arr[hi])
//        {
//        	
//        	System.err.println( lo + "  " );
//            // Probing the position with keeping
//            // uniform distribution in mind.
//            int pos = lo + (((hi-lo) /
//                  (arr[hi]-arr[lo]))*(x - arr[lo]));
//      
//            // Condition of target found
//            if (arr[pos] == x)
//                return pos;
//      
//            // If x is larger, x is in upper part
//            if (arr[pos] < x)
//                lo = pos + 1;
//      
//            // If x is smaller, x is in lower part
//            else
//                hi = pos - 1;
//        }
//        return -1;
//    }
    
	
//	static int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
  //          34, 55, 89, 144, 233, 377, 610};
    
    
  public static int interpolationSearch(int arr[] , int n , int x){
	  
	  int lo = 0;
	  int hi = (n-1);
	  
	  
	  
	  int pos1 = lo +  (x-arr[lo])*(hi-lo) / (arr[hi]-arr[lo]);
	  
	  
	  
	  while (lo <= hi && x >= arr[lo] && x <= arr[hi]){
		  
	      // Probing the position with keeping
	      // uniform distribution in mind.
	      int pos = lo + (((hi-lo) /
	            (arr[hi]-arr[lo]))*(x - arr[lo]));
	      
	      System.err.println( pos + "  " + pos1);
	      
          // Condition of target found
          if (arr[pos] == x)
              return pos;
    
          // If x is larger, x is in upper part
          if (arr[pos] < x)
              lo = pos + 1;
    
          // If x is smaller, x is in lower part
          else
              hi = pos - 1;
	  }
	  
		  
	  return -1;
  }

  
  public static void main(String [ ] args)
  {
      int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                   34, 55, 89, 144, 233, 377, 610};
      int x = 89;

      // Find the index of 'x' using Jump Search
      int index = interpolationSearch(arr , arr.length , x);

      // Print the index where 'x' is located
      System.out.println("\nNumber " + x +
                          " is at index " + index);
  }
  
}
