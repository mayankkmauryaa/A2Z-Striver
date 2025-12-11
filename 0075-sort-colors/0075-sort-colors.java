class Solution {
    public void sortColors1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for (int num : nums) {
            map.put(num, map.get(num) + 1);
        }
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            int freq = map.get(i);
            for (int j = 0; j < freq; j++) {
                nums[idx++] = i;
            }
        }
    }

    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
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