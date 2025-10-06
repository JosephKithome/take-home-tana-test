import java.util.ArrayList;
import java.util.List;

public class Question5_RotateList {

//    Question 5
//    In the following question you should rotate a list by moving each element in the list n times to the right.
//            Example, given the following list: "ID_A01"->"ID_A02"->"ID_A03"->"ID_A04"->"ID_A05"->"ID_A06"->null and n=2 You should return the following list: "ID_A05"->"ID_A06"->"ID_A01"->"ID_A02"->"ID_A03"->"ID_A04"->null
//

    public  List<String> rotateList(List<String> items, int n) {
        // If list is empty or n is 0, just return the list as it is
        if (items == null || items.isEmpty() || n == 0) {
            return items;
        }

        int size = items.size();

        // Handle cases where n is larger than the size of the list
        n = n % size;

        // If n becomes 0 after modulus, no rotation needed
        if (n == 0) {
            return items;
        }

        // Split the list into two parts:
        // the last n elements and the remaining ones
        List<String> endPart = items.subList(size - n, size);
        List<String> startPart = items.subList(0, size - n);

        // Create a new list with the rotated order
        List<String> rotated = new ArrayList<>();
        rotated.addAll(endPart);
        rotated.addAll(startPart);

        return rotated;
    }

}
