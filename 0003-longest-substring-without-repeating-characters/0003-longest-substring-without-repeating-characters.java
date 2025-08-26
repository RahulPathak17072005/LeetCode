class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch=new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            while(ch.contains(s.charAt(i))){
                ch.remove(s.charAt(left));
                left++;

            }
            ch.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-left+1);

        }
        return maxlen;
    }
}