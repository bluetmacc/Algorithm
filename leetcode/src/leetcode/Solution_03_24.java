package leetcode;

import java.util.HashMap;

// https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
class Solution_03_24 {
    // 滑动窗口
    // 把队列的左边的元素移出，直到满足题目要求.
    // 一直维持这样的队列，找出队列出现最长的长度.
    // 时间复杂度：O(n)
    public int lengthOfLongestSubstring_1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
