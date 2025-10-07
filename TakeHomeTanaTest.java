import java.util.ArrayList;
import java.util.List;

public class TakeHomeTanaTest {



    public static void main(String[] args) {
        System.out.println("Hello Welcome to tana test!!");

        Question1_GetLongestString question1GetLongestString = new Question1_GetLongestString();

        Question2_FirstUniqueProduct question2FirstUniqueProduct = new Question2_FirstUniqueProduct();
        Question4_3CommonStrings question43CommonStrings = new Question4_3CommonStrings();
        Question5_RotateList question5RotateList = new Question5_RotateList();


        List<Character> chars = List.of('A', 'B', 'C', 'D'); // allowed characters
        List<String> strings = List.of("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCACC"); //input string

        String result = question1GetLongestString.getLongestString(chars, strings);
        System.out.println("Longest valid string: " + result);


        //Question 2 tests
        String[] products = { "Apple", "Computer", "Apple", "Bag", "Computer" };
        String unique = question2FirstUniqueProduct.firstUniqueProduct(products);
        System.out.println("First unique product: " + unique);


        //Question 4 tests
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        System.out.println(question43CommonStrings.topThreeWords(input));

        // Question 5
        List<String> pr = new ArrayList<>();
        pr.add("ID_A01");
        pr.add("ID_A02");
        pr.add("ID_A03");
        pr.add("ID_A04");
        pr.add("ID_A05");
        pr.add("ID_A06");

        int n = 2; // number of rotations can be any number

        System.out.println("Original list: " + pr);

        List<String> rotatedList = question5RotateList.rotateList(pr, n);

        System.out.println("Rotated list: " + rotatedList);


        Question3_ q3 = new Question3_();
        int[] array = {1, 2, 3, 1, 4, 5, 2};
        System.out.println("The distance is calculated is: " + q3.findClosestMinimumsDistance(array)); // Expected output: 3

        int[] array2 = {5, 2, 8, 2, 6, 2};
        System.out.println("The distance calculated is: " + q3.findClosestMinimumsDistance(array2)); // Expected output: 2


    }
}
