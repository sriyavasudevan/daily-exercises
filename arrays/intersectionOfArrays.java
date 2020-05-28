import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length >= nums2.length) {
            return findIntersection(nums2, nums1);
        } else {
            return findIntersection(nums1, nums2);
        }
    }
    
    public int[] findIntersection(int[] small, int[] big) {
        int i = 0, j = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int flag = 0;
        while(i < big.length && j < small.length) {
            if(big[i] == small[j]) {
                temp.add(small[j]);
                flag = 1;
                j++;
                i++;
            } else {
                if(flag == 0) {
                    i++;
                    j = 0;
                } else {
                    i++;
                    j++;
                }
            }
        }
        
        int[] returnTemp = new int[temp.size()];
        for(int k = 0; k < temp.size(); k++) {
            returnTemp[k] = temp.get(k);
        }
        
        return returnTemp;
    }
}