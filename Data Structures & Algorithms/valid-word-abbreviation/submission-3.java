class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;

        while (i < word.length() && j < abbr.length()) {
            if (Character.isLetter(abbr.charAt(j))) {
                // logic for character matching
                if (word.charAt(i) == abbr.charAt(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            } else {
                // logic for digit matching and its count
                if (abbr.charAt(j) == '0') 
                return false;

                int subLen = 0;
                while ( j < abbr.length() && Character.isDigit(abbr.charAt(j)) ) {
                    int digit = abbr.charAt(j) - '0';
                    subLen = subLen * 10 + digit;
                    j++;
                }
                i += subLen;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}