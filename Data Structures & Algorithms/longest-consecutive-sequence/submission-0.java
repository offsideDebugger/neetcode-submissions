class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        int longest=1;
        for(int i=0;i<nums.length;i++){
            numbers.add(nums[i]);
        }
        
        if(numbers.size()==0) return 0;

        for(int i:numbers){
            if(!numbers.contains(i-1)){
                int cnt=1;
                int firstElement=i;
                while(numbers.contains(firstElement+1)){
                    cnt++;
                    firstElement=firstElement+1;
                }
                longest=Math.max(cnt,longest);
            }
        }


        return longest;

    }
}
