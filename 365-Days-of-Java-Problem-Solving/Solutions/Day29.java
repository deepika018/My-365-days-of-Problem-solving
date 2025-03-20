class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        
        while (l <= h) {
            int mid = l + (h - l) / 2; // Avoids potential integer overflow
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1; // Move right
            } else {
                h = mid - 1; // Move left
            }
        }
        return -1; // Element not found
    }
}