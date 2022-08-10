// problem: https://leetcode.com/problems/search-in-rotated-sorted-array
class Solution {
    public int search(int[] arr, int target) {
        // get the pivot index first
        int l = 0, r = arr.length -1, mid, k = 0;
        while (l<=r) {
            mid = (r-l) / 2 + l;
            if(arr[mid]<=arr[arr.length - 1]) {
                r = mid - 1;
                k = mid;
            } else {
                l = mid +1;
            }
        }
        
        // once got the pivot, search for the target using the pivot
        l = k;
        r = (arr.length - 1) + k;
        while ( l <= r)
        {
            mid = (r-l) / 2 + l;
            if(arr[mid % arr.length] == target) {
                return mid % arr.length;
            }
            else if(arr[mid % arr.length] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
