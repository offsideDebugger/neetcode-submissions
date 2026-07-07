class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int left=0;
        for(int right=left+1;right<nums.length;right++){
            if(nums[left]==nums[right]) continue;
            else{
                nums[left+1] = nums[right];
                left++;
            }
        }
        return left+1;
    }
}