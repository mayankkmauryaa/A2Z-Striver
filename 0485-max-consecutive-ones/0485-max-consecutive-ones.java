class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen = 0;
        int count = 0;
        for (int value : nums) {
            if (value == 1) {
                count++;
                maxlen = Math.max(maxlen, count);
            } else
                count = 0;
        }
        return maxlen;
    }
}