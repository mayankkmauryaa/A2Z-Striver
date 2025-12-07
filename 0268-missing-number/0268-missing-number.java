class Solution {
    public int missingNumber(int[] nums) { // XOR
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public int missingNumber1(int[] nums) { // sort -> edge case -> traverse
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] != 0)
            return 0;
        if (nums[n - 1] != n)
            return n;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return 0;
    }

    public int missingNumber2(int[] nums) { // running sum
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += i - nums[i];
        }
        return sum;
    }

    public int missingNumber3(int[] nums) { // resposition in another array a/c to idx
        int n = nums.length;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            arr[nums[i]] = nums[i];
        }
        for (int i = 0; i < n + 1; i++) {
            if (arr[i] == -1)
                return i;
        }
        return 0;
    }
}
