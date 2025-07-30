class Solution {
    public int sumSubarrayMins(int[] arr) {
         int MOD = 1_000_000_007;
        int n = arr.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            long leftCount = i - prevSmaller[i];
            long rightCount = nextSmaller[i] - i;
            long total = (arr[i] * leftCount % MOD) * rightCount % MOD;
            sum = (sum + total) % MOD;
        }
        return (int) sum; 
    }
}