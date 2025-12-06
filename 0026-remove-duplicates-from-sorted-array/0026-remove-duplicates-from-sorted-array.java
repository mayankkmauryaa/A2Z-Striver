class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // slow - keeps the track of last unique element
        for (int j = 1; j < nums.length; j++) { // fast - scans the array
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
