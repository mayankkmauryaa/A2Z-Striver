class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
        }
        int i = 0;
        while (zero != 0) {
            nums[i++] = 0;
            zero--;
        }
        while (one != 0) {
            nums[i++] = 1;
            one--;
        }
        while (i < n) {
            nums[i++] = 2;
        }
    }
}