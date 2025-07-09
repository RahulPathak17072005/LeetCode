class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch=new HashSet<>();
        int left=0,maxLen=0;
        for (int i = 0; i < s.length(); i++) {
            while (ch.contains(s.charAt(i))) {
                ch.remove(s.charAt(left));
                left++;
            }
            ch.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}