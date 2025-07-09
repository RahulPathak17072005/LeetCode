class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int curr=nums[0];
        if(n==1)return nums[0];
        for(int i=1;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            maxSum=Math.max(maxSum,curr);
        }
        return maxSum;
    }
}