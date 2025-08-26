class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int curr=nums[0];
        for(int n:nums){
            if(curr==n){
                freq++;
            }else{
                freq--;
                if(freq==0){
                    curr=n;
                    freq++;
                }
            }
        }
        return curr;
    }
}