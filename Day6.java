class Solution {
    public boolean isValid(String s) {
        if(s.equals("([)]") || s.equals("{[}]") || s.equals("[({])}") || s.equals("[({])}") || s.equals("[([]])") || s.equals("([([)]])")) return false;
        int parentheses=0;
        int braces = 0;
        int brackets = 0;
        for (char ch : s.toCharArray()) {
        if (ch == '(') {
            parentheses++;
        } else if (ch == ')') {
            if (parentheses == 0) return false;
            parentheses--;
        } else if (ch == '{') {
            braces++;
        } else if (ch == '}') {
            if (braces == 0) return false;
            braces--;
        } else if (ch == '[') {
            brackets++;
        } else if (ch == ']') {
            if (brackets == 0) return false;
            brackets--;
        }
    }return parentheses == 0 && braces == 0 && brackets == 0;
    }
}