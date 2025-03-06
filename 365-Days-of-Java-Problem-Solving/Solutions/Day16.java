class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0)return "";

        String first=strs[0];
        String last=strs[0];

        for(String s:strs){
            if(first.compareTo(s)>0){
                first=s;
            }
            if(last.compareTo(s)<0){
                last=s;
            }
        }
        int len=Math.min(first.length(),last.length());

        int i=0;
        for(i=0;i<len;i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
        }
        return first.substring(0,i);
    }
}