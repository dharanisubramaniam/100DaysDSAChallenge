import java.util.*;

public class NextGreaterFinder {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store: Number -> Its Next Greater Element
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Build the map using nums2
        for (int num : nums2) {
            // While the current number is greater than the stack's top
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Prepare the result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}