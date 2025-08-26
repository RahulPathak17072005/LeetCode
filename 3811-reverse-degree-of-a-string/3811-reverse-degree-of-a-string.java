class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int curr = 26 - (arr[i]-'a');
            curr*=i+1;
            sum+=curr;
        }
        return sum;
    }
}