
class Solution {

    public String sorted(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a); 
        return new String(a);  
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; 
        
        String sortedS = sorted(s);
        String sortedT = sorted(t);  
        
        return sortedS.equals(sortedT);  
    }
}
