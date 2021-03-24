package leetcode;

// https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
class Solution_03_24 {
    // 滑动窗口
    // 把队列的左边的元素移出，直到满足题目要求.
    // 一直维持这样的队列，找出队列出现最长的长度.
    // 时间复杂度：O(n)
    public int lengthOfLongestSubstring_1(String s) {
        int count = 0;
        int res = 0;
        String snap = "";
        for(int i = 0; i < s.length();i++){
            String sindex = s.substring(i,i+1);
            if(snap.contains(sindex)){
                snap = snap.substring(snap.indexOf(sindex)+1,snap.length())+sindex;
                if(res<count)res=count;
                count = snap.length();
            }else{
                snap += sindex;
                count++;
            }
        }
        return res>count?res:count;
    }
}
