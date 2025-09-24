class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            int p=0,q=i-1;
            while(p<q){
                int sum=nums[p]+nums[q];
                if(sum>nums[i]){
                count +=(q-p);
                    q--;
                }else{
                    p++;
                }
            }
        }
        return count;
    }
}