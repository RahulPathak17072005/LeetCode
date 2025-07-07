class Solution {
    public int[] closestPrimes(int left, int right) {
       boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1 && i - prev < minDiff) {
                    minDiff = i - prev;
                    res[0] = prev;
                    res[1] = i;
                }
                prev = i;
            }
        }
        return res;  
    }
}