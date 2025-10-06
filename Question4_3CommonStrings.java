import java.util.*;

public class Question4_3CommonStrings {


//    Question 4
//    Given a sentence, return the three most common strings in it.
//    For example: input: "hi there care to discuss algorithm basis or how to solve algorithm or" -> will return - ["algorithm", "or","to "] Note: please return the strings in an ascending alphabetic order


    public List<String> topThreeWords(String sentence) {
            String[] words = sentence.trim().split("\\s+");
            Map<String, Integer> freq = new HashMap<>();
            for (String word : words) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
            // Sort by frequency (desc), then alphabetically (asc)
            List<String> sorted = new ArrayList<>(freq.keySet());
            sorted.sort((a, b) -> {
                int cmp = freq.get(b).compareTo(freq.get(a));
                return cmp != 0 ? cmp : a.compareTo(b);
            });
            // Get top 3 and sort alphabetically
            List<String> result = sorted.subList(0, Math.min(3, sorted.size()));
            Collections.sort(result);
            return result;
        }
    }

