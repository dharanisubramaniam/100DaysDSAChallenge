import java.util.*;
import java.lang.*;
import java.io.*;

class CountingOccurencesInAnArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int[] arr = {12,100,3,1,4,12,17,91,12,50,50,50,50,50};
        int target= 50;
        Arrays.sort(arr); // required
        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        int count = 0;
        if (firstIndex != -1 && lastIndex != -1) {
            count = lastIndex - firstIndex + 1;
        }
           
        }
    
// Find first occurrence of target
    private static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = (start + (end-start)) / 2;
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1; // move left for earlier occurrence
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    // Find last occurrence of target
    private static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = (start + (end-start)) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1; // move right for later occurrence
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
        
       
       
	
}
