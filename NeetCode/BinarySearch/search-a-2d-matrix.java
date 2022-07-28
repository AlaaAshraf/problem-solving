// problem: https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // assume that the matrix is a 1-D array and Binary Search on it
        // complexity: log(n*m)

        int rowCount = matrix[0].length;
        int start = 0, end = matrix.length * rowCount - 1;
        int num, mid;
        while(end>=start) {
            mid = ((end - start) / 2) + start;
            num = matrix[mid/rowCount][mid%rowCount];
            if(num == target)
                return true;
            if(target > num){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
