class Solution {
    public int[] plusOne(int[] digits) {
        int digLen = digits.length;
        
        if(digits[digLen - 1] < 9) {
            digits[digLen - 1] += 1;
            return digits;
        } else {
            int cnt = 1;            
            for(int i = digLen - 2; i >= 0 ; i--) {
                if(digits[i] == 9) {
                    cnt++;
                }
            }
            //all 9s - requires extra array space
            if(cnt == digLen) {
                int[] temp = new int[digLen + 1]; 
                temp[0] = 1;
                return temp;
            
            //only one 9 - last place = 0 and last second += 1
            } else if(cnt == 1) {
                digits[digLen - 1] = 0;
                digits[digLen - 2] += 1;
           
            //more than 1 but not all of them    
            } else {
                digits[digLen - 1] = 0;
                for(int i = digLen - 2; i >= 0 ; i--) {
                    if(digits[i] < 9) {
                        digits[i] += 1;
                        break;
                    } else {
                        digits[i] = 0;
                    }
                }
            }
            return digits;
        }

    }
}