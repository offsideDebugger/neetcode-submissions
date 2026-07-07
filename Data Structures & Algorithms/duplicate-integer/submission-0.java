
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> digits=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(digits.containsKey(nums[i])){
                return true;
            }
            digits.put(nums[i],count);
        }

        return false;
    }
}