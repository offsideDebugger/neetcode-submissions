class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> stack=new HashMap<>();
        int[] ans={-1,-1};
        for(int i=0;i<nums.length;i++){
            int more=target-nums[i];
            if(stack.containsKey(more)){
                ans[0]=stack.get(more);
                ans[1]=i;
                return ans;
            }
            stack.put(nums[i],i);
        }

        return ans;
    }
}
