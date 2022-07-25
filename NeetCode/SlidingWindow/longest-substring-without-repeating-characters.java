// problem: https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // solution: two pointers, start from the beginning and add characters as long as these characters weren't added
        // use a hashmap to lookup whether a character has been added or not
        // complexity: O(n)
        Map<Character, Boolean> mapp = new HashMap();
        int i = 0;
        int j = 0;
        int maxx = 0;
        while(i<s.length() && j<s.length()){
            if(!mapp.getOrDefault(s.charAt(j), false)){
                if(j-i+1>maxx) {
                    maxx = j-i+1;
                }
                mapp.put(s.charAt(j), true);
                j++;
            } else {
                mapp.put(s.charAt(i), false);
                i++;
            }
        }
        return maxx;
    }
}
