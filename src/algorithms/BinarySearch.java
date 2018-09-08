/*
 * BinarySearch algorithm
 */
package algorithms;

/**
 *
 * @author xcoder Example - BinarySearch algorithm Page 25
 */
public class BinarySearch {

    public static int rank(int x, int[] y) {
        int low = 0;
        int high = y.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (x < y[middle]) {
                high = middle - 1;
            } else if (x > y[middle]) {
                low = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
