class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0)
            sign = -1;
        x *= sign;
        int ans = 0;
        while (x > 0) {
            int digit = x % 10;
            // Check overflow BEFORE doing ans = ans * 10 + digit
            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            ans = ans * 10 + digit;
            x /= 10;
        }
        ans *= sign;
        return ans;
    }
}