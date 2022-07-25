//problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int maxx=0;
        
        // naiive solution
        // loop through all numbers,
        // for each number calculate the difference b/w it and numbers to the right
        // store max diff
        // complexity O(n^2)
        // Time Limit Exceeded :(
        
        /*for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j]-prices[i]>maxx)
                    maxx = prices[j]-prices[i];
            }
        }*/
        
        // another solution
        // two-pointers
        // whenever second pointer value is less than first ptr val, update first ptr
        // else, move sec ptr forward
        // complexity O(n)
        int i = 0;
        int j = 1;
        int len = prices.length;
        while(j<len){
            if(prices[j]-prices[i]>maxx) 
                maxx = prices[j]-prices[i];
            
            if(prices[j]<prices[i]){
                i=j;
            }
            j++;
        }
        return maxx;
    }
}
