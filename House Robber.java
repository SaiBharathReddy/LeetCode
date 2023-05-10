class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len<3){
            Arrays.sort(nums);
            return nums[len-1];
        }
        nums[2]+=nums[0];
        for(int i=3;i<len;i++){
            nums[i]+=Math.max(nums[i-2],nums[i-3]);
        }
        Arrays.sort(nums);
        return nums[len-1];
    }
}