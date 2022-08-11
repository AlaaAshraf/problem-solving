// problem: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
class Solution {
    public int findMin(int[] arr) {
        int l = 0, r = arr.length, mid, min = 0;
        while(l<=r) {
            mid = (r-l)/2 + l;
            if(arr[mid]<=arr[arr.length - 1]) {
                min = arr[mid];
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return min;
    }
}
