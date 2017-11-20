/*
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example: 
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
public class Checkpoint5 {
	public int longestConsecutive(final List<Integer> a) {
	    
	    Set<Integer> hashTable = new HashSet();
	    for(int i=0; i<a.size();i++){
	        int val = a.get(i);
	        hashTable.add(val);
	    }
	    int max=0;
	    int count=0;
	    for(int i=0;i<a.size();i++){
	        int val=a.get(i);
	        if(!hashTable.contains(val-1)){
	            count=0;
	            while(hashTable.contains(val++)){
	                count++;
	            }
	            max=Math.max(max,count);
	        }
	    }
	 return max;   
	}

}
