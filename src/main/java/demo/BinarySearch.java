package demo;

public class BinarySearch {
    public static boolean binarySearch(int[] values, int key) {

        int low = 0;
        int high = values.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (values[mid] == key) {
                return true;
            } else if (values[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return false;
    }
}