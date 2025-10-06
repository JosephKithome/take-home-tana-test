import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1_GetLongestString {
//    Question 1
//    Please implement the function getLongestString to return the longest string which matches the following conditions:
//            1. The string should have non-repetitive identical characters, for example 'AABCD' is not valid since it contains 'AA'.
//            2. The string should only contain the characters among given list of valid characters. Function parameters: - characters - List of valid characters. - strings - Array of Strings
//    Example Scenario: List of characters: "ABCD" List of strings: "AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA" The function should return: "ABCDABDCA" Explanation: "AABCDA" contains repetitive characters 'AA'. "ABCDZADC" contains illegal character 'Z' which is not present in the list of valid characters. There are two valid strings "ABCDBCA" and "ABCDABDCA". Between these two, "ABCDABDCA" is the longest one.

    public  String getLongestString(List<Character> allowedChars, List<String> inputStrings) {
        // quick sanity check
        if (allowedChars == null || inputStrings == null || allowedChars.isEmpty() || inputStrings.isEmpty()) {
            return null;
        }

        Set<Character> allowed = new HashSet<>(allowedChars); // Stores the values of the accepted chars

        String longestMatch = null; // initializes the longestMatch placeholder to null

        for (String str : inputStrings) {
            if (str == null || str.isEmpty()) continue;

            if (isValidString(str, allowed)) {
                // update if it's the first valid or longer than what we have
                if (longestMatch == null || str.length() > longestMatch.length()) {
                    longestMatch = str;
                }
            }
        }

        return longestMatch;
    }

    // checks if the string only has allowed chars and no repeated consecutive letters
    private static boolean isValidString(String str, Set<Character> allowed) {
        char prev = 0;

        for (char ch : str.toCharArray()) {
            if (!allowed.contains(ch)) {
                return false; // illegal character found,remember we have whitelisted chars to validate from
            }

            if (ch == prev) {
                return false; // recurring duplicate found
            }

            prev = ch;
        }

        return true;
    }

}
