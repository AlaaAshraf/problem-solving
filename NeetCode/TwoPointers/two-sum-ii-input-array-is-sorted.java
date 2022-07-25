// problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // solution: two pointers
        // first at the beginning, second at the end
        // if sum is greater than target, then we want to decrease it
        // shift second pointer to the left
        // if sum is less than target, then we want to increase it
        // shift first pointer to the right 
        int[] solution = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(i<j) {
            if(numbers[i]+numbers[j]==target) {
                break;
            }
            if(numbers[i]+numbers[j]>target)
                j--;
            else i++;
        }
        solution[0]=i+1;
        solution[1]=j+1;
        return solution;
        
    }
}
