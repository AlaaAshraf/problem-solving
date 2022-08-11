// problem: https://leetcode.com/problems/subsets
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        createSubsets(nums, 0, new LinkedList<Integer>(), result);
        return result;
    }
    void createSubsets(int[] nums, int index, LinkedList<Integer> temp, List<List<Integer>> result) {
        if(index == nums.length) {
            List<Integer> copy = new LinkedList<>(temp);
            result.add(copy);
            return;
        }
        
        // leave it
        createSubsets(nums, index+1, temp, result);
        
        //take it
        temp.addLast(nums[index]);
        createSubsets(nums, index+1, temp, result);
        // remove it
        temp.removeLast();
    }
}
