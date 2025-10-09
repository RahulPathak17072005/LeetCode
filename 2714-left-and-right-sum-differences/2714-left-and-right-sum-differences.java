class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] ans=new int[nums.length];
       int total=0;
       int left=0,right=0;
       for(int i=0;i<nums.length;i++){
        total +=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        right =total-left-nums[i];
        ans[i]=Math.abs(left-right);
        left +=nums[i];


       }
       return ans;
    }
}