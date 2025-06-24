class Solution {
    static int ans;
    public static void solve(int idx, int[] nums, int currxor) {
        if (idx >= nums.length) {
            ans += currxor;
            return;
        }
        solve(idx + 1, nums, currxor ^ nums[idx]);
        solve(idx + 1, nums, currxor);
    }
    public int subsetXORSum(int[] nums) {
        ans = 0;
        solve(0, nums, 0);
        return ans;
    }
}
