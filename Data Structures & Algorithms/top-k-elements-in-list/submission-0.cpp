class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int>pp;
        for(auto n:nums){
            pp[n]++;
        }

        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> que;
        
        for(auto it:pp){
            que.push(make_pair(it.second,it.first));
            if(que.size()>k){
                que.pop();
            }
        }
        vector<int>ans;
        while(!que.empty()){
            ans.push_back(que.top().second);
            que.pop(); // missing
        }

        return ans;
    }
};
