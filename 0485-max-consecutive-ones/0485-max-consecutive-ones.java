class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int maxlen = 0;
        int n = nums.length;
        int count = 0;
        for (int r = 0; r < n; r++) {
            if (nums[r] == 1) {
                count++;
                maxlen = Math.max(maxlen, count);
            } else {
                count = 0;
            }
        }
        return maxlen;
    }
}