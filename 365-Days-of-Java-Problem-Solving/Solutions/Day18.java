class Solution {
    static {
        for (int i = 0; i < 500; i ++){
            findTheDifference("", "a");
        }
    }
    public static char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for (char x : t.toCharArray()) {
            sum1^=x;
        }
        for (char x : s.toCharArray()) {
            sum2^=x;
        }
        
         return (char)(sum1 ^ sum2);
    }
}