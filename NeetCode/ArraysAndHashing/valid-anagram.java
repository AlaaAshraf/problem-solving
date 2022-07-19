class Solution {
    public boolean isAnagram(String s, String t) {
        // naiive solution
        // sort both strings and check whether they are identical
        /*char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String sSorted = new String(sArray);
        String tSorted = new String(tArray);
        return sSorted.equals(tSorted);*/

        // better solution
        // count the characters in both strings and compare char count

        int[] sCharCount = new int[26];
        int[] tCharCount = new int[26];

        for(char c : s.toCharArray()) {
            sCharCount[c-'a']++;
        }
        
        for(char c : t.toCharArray()) {
            tCharCount[c-'a']++;
        }

        for(int i=0; i<26; i++) {
            if(sCharCount[i] != tCharCount[i])
                return false;
        }
        return true;
    }
}
