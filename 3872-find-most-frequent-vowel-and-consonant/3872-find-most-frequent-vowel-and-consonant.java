class Solution {
    public int maxFreqSum(String s) {
        int v=0;
        int c=0;
        int[] freq=new int[26];
        char[] vowels={'a','e','i','o','u'};
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        for(char ch:vowels){
            v=Math.max(v,freq[ch-'a']);
        }
        for (char cl = 'a'; cl <= 'z'; cl++) {
            if (cl != 'a' && cl != 'e' && cl != 'i' && cl != 'o' && cl != 'u') {
                c=Math.max(c,freq[cl-'a']);
            }
        }
        return c+v;
    }
}