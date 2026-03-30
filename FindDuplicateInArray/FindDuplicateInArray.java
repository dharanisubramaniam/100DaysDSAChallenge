class FindDuplicateInArray {
    public int findDuplicate(int[] nums) {
        	int j=0;
	        int i=0;
            int n=nums.length-1;
            int output =0;
	    while(i<=n){
	        if((j+2)<(n+1)){
                j+=2;
            }else if(j==n){
	        
            j=1;} else if((j+2)>n){
                
                j=2;
            }
	        if(nums[i]==nums[j]){
                output=nums[i];
	           return output;
	        }
	       i++;
	    }
        return output;
    }
}