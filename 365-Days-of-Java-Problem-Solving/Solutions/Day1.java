class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Map=new HashMap<>();
        int number=nums.length;
        for (int i=0;i<number;i++){
            Map.put(nums[i],i);
        }
        for(int i=0;i<number;i++){
            int complement=target-nums[i];
            if(Map.containsKey(complement)&& Map.get(complement)!= i){
                return new int[]{i, Map.get(complement)};
            }
        }
        return new int[]{};
        
    }
}