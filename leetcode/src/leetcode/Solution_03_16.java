package leetcode;

import java.util.*;

// https://leetcode-cn.com/problems/reverse-integer/
class Solution_03_16 {
    // 时间复杂度：O(log(x))，x 中大约有 log_{10}(x)位数字
    // 空间复杂度：O(1)。
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
