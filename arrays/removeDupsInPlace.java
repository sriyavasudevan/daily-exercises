class Solution {
    public int removeDuplicates(int[] nums) {
      int count = 1;
      int index = 0;
      for(int i = 1; i < nums.length; i++) {
          if(nums[i] == nums[i-1]) {
              count++;
          } else {
              nums[i - count] = nums[i-1];
              index = i - count;
          }
          
          //for last element
          if(i == (nums.length-1)) {
              index += 1;
              nums[index] = nums[i];
          }
      }
    return index+1;
    }
}
