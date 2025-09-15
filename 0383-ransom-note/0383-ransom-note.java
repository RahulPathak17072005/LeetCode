class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] arr=new int[26];
       for(char c:magazine.toCharArray()){
        arr[c-'a']++;
       }
       for(char c1:ransomNote.toCharArray()){
        if(arr[c1-'a']==0){
            return false;
        }
        arr[c1-'a']--;
       }
       return true;
    }
}