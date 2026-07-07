#include<set>
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::set<int> numsFC;
        for(int i:nums){
            if(numsFC.contains(i)){
                return true;
            }
            numsFC.insert(i);
        }

        return false;
    }
};