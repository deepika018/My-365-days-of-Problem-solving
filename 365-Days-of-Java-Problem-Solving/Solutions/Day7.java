class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n<2){
            return n;
        }

        int left=0, right=0;

        while(++right < n){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        
        return (++left);
    }
}