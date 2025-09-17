class Solution {
    public boolean isPalindrome(String s) {
         String str=s.toLowerCase().replaceAll("[^0-9a-z]", "");
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
                left++;
                right--;
        }
        return true;
    }
}