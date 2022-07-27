// problem: https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        // straight forward stack problem
        if(s.length()%2==1)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else if(stack.empty() || (c==')' && stack.pop()!='(') || (c==']' && stack.pop()!='[') || 
                   (c=='}' && stack.pop()!='{')) 
                return false;
        }
        
        return stack.empty();
    }
}
