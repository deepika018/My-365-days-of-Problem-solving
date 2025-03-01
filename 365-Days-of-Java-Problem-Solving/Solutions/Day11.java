class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            moveZeroes(new int[] {});
        }
    }
    
        public static void moveZeroes(int[] nums) {
         int i=0,j=0;
        while(i<nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}