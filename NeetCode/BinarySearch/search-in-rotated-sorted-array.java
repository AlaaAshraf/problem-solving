// problem: https://leetcode.com/problems/search-in-rotated-sorted-array
class Solution {
    public int search(int[] arr, int target) {
        // get the pivot index first
        int l = 0, r = arr.length -1, mid, k = 0;
        while (l<=r) {
            mid = (r-l) / 2 + l;
            if(arr[r]>arr[mid]) {
                r = mid - 1;
                if(arr[mid]<arr[k])
                    k = mid;
            } else {
                l = mid +1;
                if(arr[r]<arr[k])
                    k = r;
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
