package leetcode;

import java.util.*;

// https://leetcode-cn.com/problems/palindrome-number/
class Solution_03_15 {
    // 时间复杂度：O(logn)，对于每次迭代，会将输入除以 10，因此时间复杂度为 O(logn)。
    // 空间复杂度：O(1)。只需要常数空间存放若干变量。
    public boolean isPalindrome(int x) {
        // 排除复数和末尾为零的数
        if ((x < 0) || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return (x == revertedNumber) || (x == revertedNumber / 10);
    }

}

