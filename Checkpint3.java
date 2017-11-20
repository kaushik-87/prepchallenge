/*
 * Find the kth smallest element in an unsorted array of non-negative integers.

Definition of kth smallest element

 kth smallest element is the minimum possible n such that there are at least k elements in the array <= n.
In other words, if the array A was sorted, then A[k - 1] ( k is 1 based, while the arrays are 0 based ) 
NOTE
You are not allowed to modify the array ( The array is read only ). 
Try to do it using constant extra space.

Example:

A : [2 1 4 3 2]
k : 3

answer : 2
 */
public class Checkpint3 {
	public int kthsmallest(final List<Integer> a, int k) {
	    if (a == null || a.size() == 0) {
	        return -1;
	    }
	    int min = Collections.min(a);
	    int max = Collections.max(a);
	    
	    while (min<=max){
	        int mid = min + (max-min)/2;
	        int count = 0;
	        int count2 = 0;
	        
	        for(int i=0;i<a.size();i++){
	            if(a.get(i) < mid) {
	                count++;
	            }else if (a.get(i) == mid) {
	                count2++;
	            }
	            
	            if(count >= k)break;
	        }
	        
	        if(count < k && count + count2 >=k){
	            return mid;
	        }
	        else if (count >= k){
	            max = mid-1;
	        }else {
	            min = mid+1;
	        }
	        
	    }
	    return -1;
	}

}
