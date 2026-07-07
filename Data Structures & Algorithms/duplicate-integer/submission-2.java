class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(numbs.contains(nums[i])){
                return true;
            }
            numbs.add(nums[i]);
        }

        return false;
    }
}