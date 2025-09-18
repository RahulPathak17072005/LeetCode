class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int[] arr=new int[nums.length];
        // int index=0;
        // for(int num:nums){
        //     if(num%2==0){
        //         arr[index++]=num;
        //     }
        // }
        // for(int num:nums){
        //     if(num%2!=0){
        //         arr[index++]=num;
        //     }
        // }
        // return arr;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]%2==0){
                left++;
            }else if(nums[right]%2==1){
                right--;
            }else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}