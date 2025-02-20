class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        int st = 0;
        int e = n-1;

        while(st<=e)
        {
            char temp;
            temp = s[e];
            s[e]=s[st];
            s[st]=temp;

            st++;
            e--;
        } 
    }
}
