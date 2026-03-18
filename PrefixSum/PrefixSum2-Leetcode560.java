import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int[] arr = {1, -1, 0, 2, -2};
        int k = 0;

        // Key: PrefixSum, Value: Number of times this sum has occurred
        HashMap < Integer, Integer > map = new HashMap < > ();

        // BASE CASE: A sum of 0 has been seen once (before we even start)
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // If (currSum - k) exists in the map, it means there is a 
            // subarray ending here that sums to k!
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Update the map with the current prefix sum
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        System.out.println("Output: " + count); // Correct Output: 6

    }
}