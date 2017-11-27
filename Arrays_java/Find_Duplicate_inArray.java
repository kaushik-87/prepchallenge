/*
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
 
 Sample Input:
 
 [3 4 1 4 1]
 Sample Output:
 
 1
 If there are multiple possible answers ( like in the sample case above ), output any one.
 
 If there is no duplicate, output -1
 
 NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        
        Set numberSet = new HashSet();
        for (int i=0;i<a.size();i++){
            if (numberSet.contains(a.get(i))){
                return a.get(i);
            }
            numberSet.add(a.get(i));
        }
        return -1;
    }
}

