class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        List<Integer> indices = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]==key)indices.add(j);
           
        }
        for(int i=0;i<n;i++){
            for(int j:indices){
                if(Math.abs(i-j)<=k){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }       
}