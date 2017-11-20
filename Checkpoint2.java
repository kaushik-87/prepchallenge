

/*
 * 
 Print concentric rectangular pattern in a 2d matrix. 
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
 */

public class Checkpoint2 {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList();
	    int size = (a * 2) -1;
	    int [][] matrix = new int[size][size];
	    //int matrix[size][size];
	    
	    for (int i=0;i<a;i++){
	        for(int j=0;j<a;j++){
	            if (j<=i){
	                matrix[i][j] = a-j;
	            }else{
	                matrix[i][j] = a-i;
	            }
	        }
	    }
	    
	    for (int i=0;i<a;i++) {
	        for(int j=size-1;j>=a;j--){
	            matrix[i][j] = matrix[i][size-1-j];
	        }
	    }
	    
	    for (int i=size-1;i>=a;i--){
	        for (int j=0;j<size;j++) {
	            matrix[i][j] = matrix[size-1-i][j];
	        }
	    }
	    
	    for (int i=0;i<size;i++){
	        ArrayList<Integer> row = new ArrayList<Integer>();
	        for(int j=0;j<size;j++){
	            row.add(matrix[i][j]);
	        }
	        
	        result.add(row);
	    }
	    
	    return result;
	}
}
