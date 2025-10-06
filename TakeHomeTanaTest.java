import java.util.ArrayList;
import java.util.List;

public class TakeHomeTanaTest {



    public static void main(String[] args) {
        System.out.println("Hello Welcome to tana test!!");

        Question1_GetLongestString question1GetLongestString = new Question1_GetLongestString();
        Question2_FirstUniqueProduct question2FirstUniqueProduct = new Question2_FirstUniqueProduct();


        List<Character> chars = List.of('A', 'B', 'C', 'D');
        List<String> strings = List.of("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA");

        String result = question1GetLongestString.getLongestString(chars, strings);
        System.out.println("Longest valid string: " + result);


        //Question 2 tests
        String[] products = { "Apple", "Computer", "Apple", "Bag" };
        String unique = question2FirstUniqueProduct.firstUniqueProduct(products);
        System.out.println("First unique product: " + unique);


    }
}
