class MaxSubArray {
    public int maxSubArray(int[] nums) {
        	int maxSum=nums[0]; //or Integer.MINVALUE
		     int currentSum=0;
		for(int i=0;i<nums.length;i++){
		    currentSum=currentSum+nums[i];
		    if(nums[i]>currentSum){
		        currentSum=nums[i];
		    }
		   if(currentSum>maxSum){
		       maxSum=currentSum;
		   }
		     
		}
        return maxSum;
    }
    //another version 
    public int maxSubArray(int[] nums) {
    // We start both at the first element to handle the "all-negative" case
    int maxSoFar = nums[0];
    int currentMax = nums[0];

    for (int i = 1; i < nums.length; i++) {
        // Decision: Should I extend the existing subarray or start a new one at i?
        currentMax = Math.max(nums[i], currentMax + nums[i]);
        
        // Update the global maximum if the current subarray is the best we've seen
        maxSoFar = Math.max(maxSoFar, currentMax);
    }

    return maxSoFar;
}
}