class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }
        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.ceil((double) piles[j] / mid);
            }
            if (sum <= h) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}