package sets;

import java.util.*;

public class SubarrayWithZeroSum {
	/*
	 * Given an array, find if there exists a subarray with sum equals to zero. 
	 * n < 10^5
	 * tags -> amazon , microsoft
	 */

//	public static void main(String[] args) {
//		
//		int[] a = {2 , 1, -3, 4 , 2};
//		boolean found = false;
	
	
	
	/* O(n^2)
	for(int i=0; i<a.length; i++) {
			int sum = 0;
			
				for(int j=1; j<a.length; j++) {
					sum += a[j];
					if(sum == 0) {
						found = true;
						break;
					}
				}
				
				if(found)  break;
		}
	*/
		
	// O(N)  ---> USING SET D.S.
//		Set<Integer> set = new HashSet<>();
//		int sum = 0;
//		for(int element: a) {
//			set.add(sum);
//			 sum += element;
//			 if(set.contains(sum)) {
//				  found = true;
//				  break;
//				  
//			 }
//			 
//		}
//		System.out.println("found " + found);
		
		/*
		 * Given an array, find if there exists a subarray with sum equals to K. 
		 * n < 10^5
		 * tags -> amazon , microsoft
		 */
		
		public static void main(String[] args) {
			
			int[] a = {2 , 1, -3, 4 ,-2};
			int k = 5;
			boolean found = false;
			
			Set<Integer> set = new HashSet<>();
			int sum = 0;
			for(int element: a) {
				set.add(sum);
				 sum += element;
				 if(set.contains(sum-k)) {
					  found = true;
					  break;
					  
				 }
				 
			}
			System.out.println("found " + found);
	}

}
