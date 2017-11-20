/*
 * Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 
More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]
Elements for which no greater element exist, consider next greater element as -1.

Example:

Input : A : [4, 5, 2, 10]
Output : [5, 10, 10, -1]

Example 2:

Input : A : [3, 2, 1]
Output : [-1, -1, -1]
 */
public class Checkpoint4 {
public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    
	    if (a == null || a.size() == 0 ) {
	        return null;
	    }
	    
	    Stack<Integer> holder = new Stack();
	   ArrayList<Integer> result1 = new ArrayList<Integer>();
	    	    int count = a.size();

	    int [] result = new int[count];
	    
	    int next, element;
	    for(int i=count-1; i>=0;--i){ 
	        
	        while(!holder.isEmpty() && holder.peek() <= a.get(i)){
	            holder.pop();
	        }
	        
	        if(!holder.isEmpty()){
	            result[i] = holder.peek();
	            
	        }else{
	            result[i] = -1;
	            
	        }
	        
	        holder.push(a.get(i));
	    }
	    
	    for(int i=0;i<result.length;i++){
	        result1.add(result[i]);
	    }
	  
	    return result1;
	}

}
