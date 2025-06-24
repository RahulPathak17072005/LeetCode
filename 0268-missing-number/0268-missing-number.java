class Solution {
    public int missingNumber(int[] nums) { 
        //int n=nums.length;
        //int[] arr=new int[n+1]; 
        //for(int i=0;i<n;i++){
          //  int index=nums[i];
         //   arr[index]=1;
       // }
        //for(int i=0;i<n+1;i++){
         //   if(arr[i]!=1){
          //      return i;
          //  }
       // }
       //return -1;
       int n=nums.length;
       int ans=nums[0];
       for(int i=1;i<n;i++){
        ans ^=nums[i];
       }
       for(int i=0;i<=n;i++){
        ans ^=i;
       }
       return ans;
    }
}

