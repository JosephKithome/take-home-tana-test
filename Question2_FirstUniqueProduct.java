import java.util.LinkedHashMap;
import java.util.Map;

/*   Question 2
*   Unique product Write a method that, efficiently with respect to time and space used,
* finds the first product in an array that occurs only once in that array.
* If there are no unique products in the array, null should be returned.
* For example, firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag" }) should return "Computer".
*/


public class Question2_FirstUniqueProduct implements interfac.Question2_FirstUniqueProduct {

    @Override
    public String firstUniqueProduct(String[] products) {
        // basic sanity check
        // validates the payload checking for nulls and if the length of the
        if (products == null || products.length == 0) {
            return null;
        }

        // keeps the order of insertion
        Map<String, Integer> counts = new LinkedHashMap<>();
        //Apple
        //Apple

        // count how many times each product appears
        for (String item : products) {
            if (counts.containsKey(item)) {
                counts.put(item, counts.get(item) + 1);  // Add the count and store or other increment
            } else {
                counts.put(item, 1);
            }
        }

        // find the first product that appears only once
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // returns null when nothing unique found
        return null;
    }

}
