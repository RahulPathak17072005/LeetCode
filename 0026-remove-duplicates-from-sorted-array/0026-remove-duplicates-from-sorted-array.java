class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int val = 0;
        for (int i : set) {
            nums[val++] = i;
        }

        return val; 
    }
}