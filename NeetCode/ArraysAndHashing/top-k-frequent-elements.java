// problem: https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // store elements count in HashMap O(n)
        // create an array with size 10^5, each index will hold the numbers occurred "index" times
        // Itereate over the map and fill the array O(n)
        // loop through the array from the end and get the k elements
        
        Map<Integer, Integer> numCount = new HashMap <Integer, Integer>();
        LinkedList<Integer>[] countList = new LinkedList[100001];

        for(int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if(countList[count] == null) {
                countList[count] = new LinkedList<Integer>();
            }
            countList[count].add(num);
        }

        int[] solution = new int[k];
        int l = 0;

        for(int i=100000; i>=1 && l<k; i--) {
            if(countList[i] == null) {
                continue;
            }
            for(int j = 0; j<countList[i].size() && l<k; j++){
                solution[l++] = countList[i].get(j);
            }
        }

        return solution;
    }
}
