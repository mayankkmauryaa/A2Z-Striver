class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            arr[nums[i]] = nums[i];
        }
        int miss= 0;
        for (int i = 0; i < n + 1; i++) {
            if (arr[i] != miss)
                return miss;
            miss++;
        }
        return n+1;
    }
}