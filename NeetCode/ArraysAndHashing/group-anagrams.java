// problem: https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // naiive solution
        // Sort each input string
        // Create a map with the key holding the sorted string 
        // and the value is a list of strings which gives the same key value after sorting
        
        Map<String, LinkedList<String>> strMap = new HashMap<String, LinkedList<String>>();
        for(String str : strs) {
            char tempArr[] = str.toCharArray();
            Arrays.sort(tempArr);
            String sortedStr = new String(tempArr);
            if(!strMap.containsKey(sortedStr)) {
                strMap.put(sortedStr, new LinkedList<String>());
            }
            strMap.get(sortedStr).add(str);
        }
        return new ArrayList(strMap.values());
    }
}
