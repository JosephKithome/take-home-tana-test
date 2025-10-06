package interfac;

import java.util.List;
import java.util.Set;

public interface Question1_GetLongestString {

     String getLongestString(List<Character> allowedChars, List<String> inputStrings);
     boolean isValidString(String str, Set<Character> allowed);
}
