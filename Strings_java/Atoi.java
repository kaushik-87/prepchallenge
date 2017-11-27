/*
 * Please Note:
 
 There are certain questions where the interviewer would intentionally frame the question vague.
 The expectation is that you will ask the correct set of clarifications or state your assumptions before you jump into coding.
 
 Implement atoi to convert a string to an integer.
 
 Example :
 
 Input : "9 2704"
 Output : 9
 Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.
 
 Questions: Q1. Does string contain whitespace characters before the number?
 A. Yes Q2. Can the string have garbage characters after the number?
 A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
 A. Return 0. Q4. What if the integer overflows?
 A. Return INT_MAX if the number is positive, INT_MIN otherwise.
 */
public class Solution {
    public int atoi(final String a) {
        
        if (a.length() <=0 || a == null) {
            return 0;
        }
        String str = a.trim(); // remove all white space
        
        int i =0;
        double result = 0;
        
        
        char symbol = '+';
        
        if (str.charAt(0) == '-'){
            symbol = '-';
            i++;
        }else if (str.charAt(0) == '+'){
            i++;
        }
        
        while (str.length() >i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        
        if(symbol == '-'){
            result = -result;
        }
        
        if (result >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        if (result <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return (int) result;
        
        
    }
}

