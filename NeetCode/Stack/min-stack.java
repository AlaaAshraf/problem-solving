// problem: https://leetcode.com/problems/min-stack
class MinStack {
    LinkedList<Integer> list; // this will hold the numbers
    LinkedList<Integer> minList; // this will hold the min number entered so far
    
    public MinStack() {
        list = new LinkedList<Integer>();
        minList = new LinkedList<Integer>();
        minList.add(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        list.add(val);
        int min = minList.getLast();
        if(val<min)
            minList.add(val);
        else 
            minList.add(min);
    }
    
    public void pop() {
        list.removeLast();
        minList.removeLast();
    }
    
    public int top() {
        return list.getLast();
    }
    
    public int getMin() {
        return minList.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
