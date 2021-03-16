package leetcode;

import java.util.*;
// https://leetcode-cn.com/problems/two-sum/
public class Solution_03_14 {
    // 时间复杂度：O(N)，其中 N 是数组中的元素数量。对于每一个元素 x，我们可以 O(1) 地寻找 target - x。
    // 空间复杂度：O(N)，其中 N 是数组中的元素数量。主要为哈希表的开销。
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
