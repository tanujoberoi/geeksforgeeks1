package org.searching;

public class LinearSearch {

	
	static int search(int arr[],int n,int x){

		for(int i=0; i < n ; i++){
			
			// Return the index of the element if the element
			// is found
			if(arr[i] == x)
				return i;
		}
		// return -1 if the element is not found
		return -1;
	}
	
	
	public static void main(String...s){
		
		int arr[] = {4,1,3,9,7};
		
		
		int x = search(arr,arr.length,9);
		
		System.err.println(x);
		
	}
}
