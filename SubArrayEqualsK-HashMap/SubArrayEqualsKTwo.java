import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public int subarraySum(int[] nums, int k) {
    int count = 0;
    int currentSum = 0;
    
    // Key: The prefix sum we've seen
    // Value: How many times we've seen that specific sum
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // Base Case: We've seen a sum of 0 exactly once (before the first element)
    // This allows us to count subarrays that start from index 0.
    map.put(0, 1);
    
    for (int i = 0; i < nums.length; i++) {
        currentSum += nums[i];
        
        // The Math: If (currentSum - previousSum == k), 
        // then (previousSum == currentSum - k).
        // Check if we've seen that 'previousSum' before.
        if (map.containsKey(currentSum - k)) {
            count += map.get(currentSum - k);
        }
        
        // Update the map with the current sum. 
        // If it's new, set to 1. If it exists, increment it.
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
    }
    
    return count;
}
}
