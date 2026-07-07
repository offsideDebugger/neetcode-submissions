class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> prevSums=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int more=target-num;
            if(prevSums.containsKey(more)){
                ans[0]=prevSums.get(more);
                ans[1]=i;
            }
            prevSums.put(num,i);
        }

        return ans;
    }
}
