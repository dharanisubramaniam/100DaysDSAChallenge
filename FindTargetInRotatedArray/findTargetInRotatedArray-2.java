class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            // Step 1: Identify which side is sorted
            if (nums[low] <= nums[mid]) { 
                // Left side is sorted
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // Target is in the sorted left
                } else {
                    low = mid + 1;  // Target is in the messy right
                }
            } else { 
                // Right side is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // Target is in the sorted right
                } else {
                    high = mid - 1; // Target is in the messy left
                }
            }
        }
        return -1; // Standard "Not Found"
    }
}