//Cole Constantino | Find the longest substring palindrome in a string

import java.util.*;
public class LongestPalindrome {
  public static String longestPalindrome(String s) {
    int n = s.length();
    int tempLen = 0;
    int bestLen = 0; 
    String bestStr = "";
    
    //edge case n = 1
    if(n == 1) return s;
    
    
    for(int i = 0; i < n; i++){
      for(int j = i+1; j < n+1; j++){
        String tempStr = s.substring(i,j);
        tempLen = tempStr.length();
        if(isPalindrome(tempStr) == true && tempLen > bestLen){
          bestLen = tempLen;
          bestStr = tempStr;
        }
      }
    }
    
    return bestStr;
  }
  public static boolean isPalindrome(String x){
    String reverse = new StringBuffer(x).reverse().toString(); 
    // check whether the string is palindrome or not 
    if (x.equals(reverse)) 
      return true; 
    else
      return false; 
  }
  
  
  public static void main(String[] args){
    String s = "asdasdasdfsdffsds";
    //System.out.println(isPalindrome(s));
    System.out.println("Longest Palindrome: " + longestPalindrome(s));
  }
}