class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
       int n=s.length();
       int j=0;
       int i=0;
       char c;
       char d;
       while(i!=n-j-1 && i<n-j-1){
           c=s.charAt(i);
           if(c>='a'&& c<='z'||c>='0'&& c<='9'){
                d=s.charAt(n-j-1);
              if(d>='a'&& d<='z'||d>='0'&& d<='9'){
                  if (!(c==d)){
                      return false;
                    }   
                }
                else{
                    i--;
                }
                j++;
            }    
            i++;
       }
      
       return true;
        
    }
}