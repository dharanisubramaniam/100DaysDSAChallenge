import java.util.*;
import java.lang.*;
import java.io.*;

class LongestPalindromeSubString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="cbbd";
		 if(s.length()<=1){return s;}
         int left=0;
		 int right=0;
		  boolean isPalindrome;
		HashMap<Integer,Character> map=new HashMap<>();
	    
	    int length =0;
	    String longestSubString=null;
		while(right<s.length()){
		    map.put(right,s.charAt(right));
		    if(map.containsValue(s.charAt(right))){
		        isPalindrome=checkPalindrome(s.indexOf(s.charAt(right)),right,s);
		       if(isPalindrome){
                 String subString = s.substring(s.indexOf(s.charAt(right)),right+1);
		            if(subString.length()>length){
		                length = subString.length();
		                longestSubString=subString;
		            }
		             
		            left++;
		        }
		    }
		    right++;
		}
		System.out.println("The longest palindrome substring:"+longestSubString)

	}
	public static boolean checkPalindrome(int left,int right,String s){
	    boolean isPalindrome=false;
	    int i=left;
	    int j=right;
	    while(i<j){
	        if(s.charAt(i)==s.charAt(j)){
	            isPalindrome = true;
	            
	        }else{
	            break;
	        }
	        i++;
	        j--;
	    }
	    return isPalindrome;
	}
}
