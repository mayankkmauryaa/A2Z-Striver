class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        int right = search(nums, target, false);
        return new int[] { left, right };
    }

    public int search(int[] nums, int target, boolean searchLeft) {
        int l = 0;
        int r = nums.length - 1;
        int idx = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target)
                r = m - 1;
            else if (nums[m] < target)
                l = m + 1;
            else {
                idx = m;
                if (searchLeft)
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return idx;
    }
}