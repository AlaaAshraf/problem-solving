// problem: https://leetcode.com/problems/binary-search
/*recursive solution
class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, 0, nums.length-1, target);
    }
    private int bs(int[] nums, int start, int end, int target) {
        if(end < start)
            return -1;
        int mid = ((end - start) / 2) + start;
        if(nums[mid] == target)
            return mid;
        if(target > nums[mid])
            return bs(nums, mid+1, end, target);
        return bs(nums, start, mid-1, target);
    }
}
*/

// non-recursive solution

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(end>=start) {
            int mid = ((end - start) / 2) + start;
            if(nums[mid] == target)
                return mid;
            if(target > nums[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}