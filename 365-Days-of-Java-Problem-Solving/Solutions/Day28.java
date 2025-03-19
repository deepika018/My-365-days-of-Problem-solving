class Solution {
    public int findKthLargest(int[] nums, int k) {
       /**PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int num : nums) {
            q.add(num);
        }
        Integer result = null;
        for(int i =0; i < k; i++) {
            result = q.poll();
        }
        return result;*/

        int[] c = new int[20001];
        for(int num: nums) {
            c[num+10000]++; // as nums range is from -10^4 to 10^4
        }
        for(int i = c.length-1; i >= 0; i--){
            if(c[i] > 0){
                k-=c[i];
                if(k<=0) return i-10000;
            }
            
        }
        return -1;
    }
}