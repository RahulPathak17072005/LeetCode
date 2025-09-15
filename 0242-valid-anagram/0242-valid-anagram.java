class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c1:t.toCharArray()){
            freq[c1-'a']--;
        }
        for(int num:freq){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}