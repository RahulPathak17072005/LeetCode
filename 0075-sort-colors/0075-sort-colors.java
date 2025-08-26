class Solution {
    public void sortColors(int[] nums) {
        int[] cnt=new int[3];
        int a=0;
        for(int n:nums){
            cnt[n]++;
        }
        for(int i=0;i<3;i++){
        while(cnt[i]>0){
            nums[a]=i;
            cnt[i]--;
            a++;
        }

        }

    }
}