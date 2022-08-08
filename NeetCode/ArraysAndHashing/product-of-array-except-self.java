// https://leetcode.com/problems/product-of-array-except-self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // multiply right to left
        // then left to right
        //example:  
            //2 5 7 9
            //X 2 10 70
            //315 126 90  70
        
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int prod = 1;
        for(int i=nums.length-1; i>0; i--) {
            prod*=nums[i];
            result[i-1]*=prod;
        }
        return result;
            
    }
}
