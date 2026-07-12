class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int j=nums.length;
        for(int i=0;i<2*nums.length;i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-j];
            }
        }

        return ans;
    }
}