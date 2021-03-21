package leetcode;

// https://leetcode-cn.com/problems/length-of-last-word/
class Solution_03_20 {
    public int lengthOfLastWord(String s) {
        // 从右向左遍历，从第一个不是空格的字符开始计数，一旦开始计数，再遇到空格就结束了
        // 时间复杂度：O(n)，n为结尾空格和结尾单词总体长度
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(count == 0) continue;
                break;
            }
            count++;
        }
        return count;
    }
}
