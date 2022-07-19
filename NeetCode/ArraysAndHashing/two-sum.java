// problem: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        // naiive solution
        // loop through each element and loop through the rest of array to find another element that sums up to target
        /*for(int i=0; i<nums.length - 1; i++){
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    solution[0]=i;
                    solution[1]=j;
                    break;
                }
            }
        }*/

        // better solution
        // store the index of each element in a map
        // loop through each element and find whether x exists (where x = target - element)
        /*Map<Integer, ArrayList<Integer> > numsMap = new HashMap<Integer, ArrayList<Integer> >();
        for(int i=0; i<nums.length; i++) {
            if(!numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], new ArrayList<Integer>());
            }
            numsMap.get(nums[i]).add(i);
        }
        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            if(x==nums[i] && numsMap.containsKey(x) && numsMap.get(x).size()>=2){
                solution[0]=numsMap.get(x).get(0);
                solution[1]=numsMap.get(x).get(1);
                break;
            } else if(x!=nums[i] && numsMap.containsKey(x) && numsMap.containsKey(nums[i])){
                solution[0]=numsMap.get(x).get(0);
                solution[1]=numsMap.get(nums[i]).get(0);
                break;
            }
        }*/
        
        // even better solution
        // store the index of each element in a map
        // lookup the map right before storing the elemenet and find whether x exists (where x = target - element)
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            if(numsMap.containsKey(x)){
                solution[0]=numsMap.get(x);
                solution[1]=i;
                break;
            }
            numsMap.put(nums[i], i);
        }
        return solution;
    }
}
