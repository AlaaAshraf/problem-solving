// problem: https://leetcode.com/problems/valid-palindrome
class Solution {
    public boolean isPalindrome(String s) {
        // create a new string including alphanumeric chars only
        // move from the start and the end and compare chars
        /*String alphaNumericStr = new String();
        for(char c: s.toCharArray()) {
            if(c>='A' && c<='Z'){
                alphaNumericStr+= Character.toLowerCase(c);
            } else if((c>='a'&&c<='z') || (c>='0' && c<='9')) {
                alphaNumericStr+=c;
            }
        }
        int j=alphaNumericStr.length()-1;
        for(int i=0; i<alphaNumericStr.length()/2; i++, j--) {
            if(alphaNumericStr.charAt(i)!=alphaNumericStr.charAt(j))
            {
                return false;
            }
        }
        return true;*/
        
        // better solution
        int j=s.length()-1;
        for(int i=0; i<s.length() && j>=0 && i<=j; i++, j--) {
            Character c1 = Character.toLowerCase(s.charAt(i));
            while(!(c1>='a'&&c1<='z') && !(c1>='0'&&c1<='9') && i<s.length()-1 && i<j){
                i++;
                c1 = Character.toLowerCase(s.charAt(i));
            }
            Character c2 = Character.toLowerCase(s.charAt(j));
            while(!(c2>='a'&&c2<='z') && !(c2>='0'&&c2<='9') && j>0 && i<j) {
                j--;
                c2 = Character.toLowerCase(s.charAt(j));
            }
            if(c1!=c2)
            {
                return false;
            }
        }
        return true;
    }
}
