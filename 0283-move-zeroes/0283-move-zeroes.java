class Solution {
    public void moveZeroes(int[] nums) { // fill non zeroes then fill zeros
        int i = 0;
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }

    public void moveZeroe(int[] nums) { // swaping
        int i = 0;
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
