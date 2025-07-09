class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int n=numbers.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}