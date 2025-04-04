class Solution {
    static{
        for(int i=0; i<500; i++){
            dailyTemperatures(new int[] {});
        }
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res = new int[n];
        int[] days = new int[n];
        int top = -1;
        for(int i=0; i<n; i++){
            while(top>-1 && temperatures[i]>temperatures[days[top]]){
                int prev = days[top--];
                res[prev] = i-prev;
            }
            days[++top] = i;
        }
        return res;
    }
}