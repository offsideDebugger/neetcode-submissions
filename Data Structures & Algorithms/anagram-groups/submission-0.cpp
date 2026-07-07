class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
       
        vector<vector<string>>ans;
        map<string,vector<string>> mpp;
        for(auto s:strs){
            string temp=s;
            sort(s.begin(),s.end());
            mpp[s].push_back(temp);
        }

        for(auto x:mpp){
            ans.push_back(x.second);
        }
        return ans;
    }
};
