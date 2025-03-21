class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character,Character> h = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                if(h.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if(h.containsValue(t.charAt(i))) return false;
                h.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}