class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    
        Map<Integer,Integer> numbs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numbs.containsKey(nums[i])){
                int temp=Math.abs(i-numbs.get(nums[i]));
                if(temp<=k){
                    return true;
                }
            }
            numbs.put(nums[i],i);
        }

        return false;
   
    }
}