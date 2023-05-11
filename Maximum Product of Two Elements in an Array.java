class Solution {
    public int maxProduct(int[] nums) {
        int r=-1,l=0;
        for(int i=1;i<nums.length;i++){
	        if(nums[i]>nums[l]){
	            r=l;
	            l=i;
	        }
	        else{
							if(r==-1){
								r=i;
							}
							else{
	            if(nums[i]>nums[r]){
	                r=i;
	            }}
	        }
	        
	    }
	    return ((nums[l]-1)*(nums[r]-1));
    }
}