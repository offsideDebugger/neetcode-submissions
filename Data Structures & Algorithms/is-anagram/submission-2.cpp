class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()) return false;
        int characs[26]={0};
        for(int i=0;i<s.size();i++){
            characs[s[i]-'a']++;
            characs[t[i]-'a']--;
        }

        for(int count:characs){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
};
