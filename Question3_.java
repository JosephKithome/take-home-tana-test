public class Question3_ {

//    Question 3
//    You are given an array of n integer numbers a[0], a[1], ..., a[n - 1]. Find the distance between the two closest (nearest) minimums in it.
//    It is guaranteed that in the array a minimum occurs at least two times.
//    Example: Given the following array [1,2,3,1,4,5,2] The function should return 3 Explanation: 1 is the smallest (minimum) number which appears twice. a[0] = 1 a[3] = 1 The distance is 3-0 = 3

        public Integer findClosestMinimumsDistance(int[] a) {
            // If the array is too small to have two minimums, handle it (though the problem guarantees this won't happen).
            if (a == null || a.length < 2) {
                return null;
            }

            int minVal = Integer.MAX_VALUE;         // To store the current minimum value found.
            int minDistance = Integer.MAX_VALUE;    // To store the smallest distance found so far.
            int lastMinIndex = -1;                  // To store the index of the last minimum we saw.

            // Loop through the array once.
            for (int i = 0; i < a.length; i++) {
                // Case 1: We found a new, smaller minimum value.
                if (a[i] < minVal) {
                    minVal = a[i];                  // Update the minimum value.
                    lastMinIndex = i;               // Update the last seen index.
                    minDistance = Integer.MAX_VALUE; // Reset the distance, since previous distances were for a larger number.
                }
                // Case 2: We found another number equal to our current minimum.
                else if (a[i] == minVal) {
                    // Calculate the distance from the last one we saw.
                    int currentDistance = i - lastMinIndex;

                    // If this new distance is the smallest yet, update our answer.
                    minDistance = Math.min(minDistance, currentDistance);

                    // Update the last seen index to the current one.
                    lastMinIndex = i;
                }
            }

            return minDistance;
        }

}
