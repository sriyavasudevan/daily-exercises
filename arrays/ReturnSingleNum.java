//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/

import java.util.*; 
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        // 1, 1, 2, 2, 4
        // 1, 2, 2
        // 1, 1, 2, 4, 4
        if(nums.length == 1) {
            return nums[0];
        }
        
        for(int i = 1; i < nums.length; i++) {
            if(i+1 == nums.length) {
                if(nums[i-1] != nums[i]) {
                    return nums[i];
                }
            }
            if(i == 1 && nums[i] != nums[i-1]) {
                return nums[i-1];
            }
            if(nums[i-1] != nums[i] && nums[i+1] != nums[i]) {
                return nums[i];
            }
        }
        return 0;
    }
}