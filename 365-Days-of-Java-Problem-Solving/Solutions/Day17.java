class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            firstUniqChar("a");
        }
    }
  public static int firstUniqChar(String s) {
    int[] count =
        new int[] {
          0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
          0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
          0, 0, 0, 0, 0, 0
        };
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
    }
    int first = s.length();
    for (int i = 0; i < 26; i++) {
      if (count[i] == 1 && s.indexOf(i + 'a') < first) {
        first = s.indexOf(i + 'a');
      }
    }
    if (first == s.length()) {
      return -1;
    }
    return first;
  }
}