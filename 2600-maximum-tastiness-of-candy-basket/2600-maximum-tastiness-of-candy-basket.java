class Solution {
    public int maximumTastiness(int[] price, int k) {
      Arrays.sort(price);
        int low = 0, high = price[price.length - 1] - price[0];
        while (low < high) {
            int mid = (low + high + 1) / 2; 
            if (canPick(price, k, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    private boolean canPick(int[] price, int k, int minDiff) {
        int count = 1, last = price[0];
        for (int i = 1; i < price.length && count < k; i++) {
            if (price[i] - last >= minDiff) {
                count++;
                last = price[i];
            }
        }
        return count >= k;
    }
}