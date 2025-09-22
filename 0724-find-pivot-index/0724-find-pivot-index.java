class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        int prefix = 0;
        int suffix=0;
        for (int num : nums) {
            total += num;
        }
        for(int i=0;i<n;i++){
            suffix=total-prefix-nums[i];
            if(suffix==prefix)return i;
            prefix+=nums[i];
        }
        return -1;
    }
}