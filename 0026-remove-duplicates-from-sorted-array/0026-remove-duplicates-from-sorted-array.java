class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // slow 
        for (int j = 1; j < nums.length; j++) { //fast
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
