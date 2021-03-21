package leetcode;

// https://leetcode-cn.com/problems/plus-one/
class Solution_03_21 {
    // 两种情况：
    // 某尾不是9加一即可
    // 某尾是9进位（并考虑前一位是否也为9）
    // 特殊情况  999   需改变数组长度 首位加一个1
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
            /*if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }*/
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
