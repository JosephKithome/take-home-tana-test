import java.util.List;

public class TakeHomeTanaTest {



    public static void main(String[] args) {
        System.out.println("Hello Welcome to tana test!!");

        // Creates an object
        Question1_GetLongestString question1GetLongestString = new Question1_GetLongestString();



        List<Character> chars = List.of('A', 'B', 'C', 'D');
        List<String> strings = List.of("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA");

        String result = question1GetLongestString.getLongestString(chars, strings);
        System.out.println("Longest valid string: " + result);

    }
}
