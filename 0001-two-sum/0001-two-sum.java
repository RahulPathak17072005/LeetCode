class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        int cont=target-curr;
        if(map.containsKey(cont)){
            return new int[]{i,map.get(cont)};
        }
        map.put(curr, i);
        }
        return new int[]{};
    }
}