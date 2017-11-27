/*
 *Given an input string, reverse the string word by word.
 
 Example:
 
 Given s = "the sky is blue",
 
 return "blue is sky the".
 
 A sequence of non-space characters constitutes a word.
 Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 If there are multiple spaces between words, reduce them to a single space in the reversed string.
 NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
 */
public class Solution {
    public String reverseWords(String a) {
        
        String[] split = a.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + " ");
        }
        
        return result.trim();
    }
}

