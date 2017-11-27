/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 
 For example:
 
 Given the array [-2,1,-3,4,-1,2,1,-5,4],
 
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 
 For this problem, return the maximum sum.
 
 NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
 */
public class Solution {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> a) {
        
        if (a.size() <= 0) {
            return 0;
        }
        
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<a.size();i++){
            sum = sum + a.get(i);
            
            if(a.get(i) > sum) {
                sum = a.get(i);
            }
            
            if (sum > maxSum) {
                maxSum = sum;
            }
            
        }
        
        return maxSum;
    }
}
