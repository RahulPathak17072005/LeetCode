class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int n=nums.length;
        int ans1=-1,ans2=-1;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i])){
                ans1=i;
                break;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(isPrime(nums[j])){
                ans2=j;
                break;
            }
        }
        return ans2-ans1;
    }
    private static boolean isPrime(int n){
            if(n<2)return false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0)return false;
            }
            return true;
        }
}