class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (charToWord.containsKey(currentChar)) {
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(currentWord)) {
                    return false;
                }
                charToWord.put(currentChar, currentWord);
                wordToChar.put(currentWord, currentChar);
            }
        }

        return true;
    }
}