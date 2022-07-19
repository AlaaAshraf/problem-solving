import java.util.HashSet;
import java.util.Set;

// problem: https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Solution: 
        //  Loop through nums and store each number in a set
        //  Before storing, check whether we stored this number before or not
        //  If number found, return true

        Set<Integer> numsSet = new HashSet<Integer>();
        for(int num : nums) {
            if(numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }
        return false;        
    }
}
