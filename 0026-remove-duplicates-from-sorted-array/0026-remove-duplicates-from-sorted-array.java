class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> s = new LinkedHashSet<>();
        for (int num : nums) {
            s.add(num);
        }

        int j = 0;
        for (int i : s) {
            nums[j++] = i;
        }

        return j; 
    }
}