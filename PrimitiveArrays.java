import java.util.*;
public class PrimitiveArrays {
    public static void main(String[] args) {
        /* ONE-DIMENSIONAL ARRAYS */
        // Useful array functions
        int[] arr1 = new int[] { 0, 9, 1, 2, 8, 9, 48, 913, -7, 0, 52 };
        int[] arr2 = new int[] { 3, 4, 5, 28, 100 }; // in ascending order

        System.out.println("Print arr1");
        Arrays.sort(arr1); // sort the array
        System.out.println(Arrays.toString(arr1));

        // Get max/min number: Sort the array, then call array[0] or array[array.length - 1]

        // Let's say you want to search the array for the value 48. You can use binarySearch(), 
        // THIS ONLY WORKS ON SORTED ARRAYS, SO CALL ARRAYS.SORT() FIRST!!!
        System.out.println("Return the index of 48 (has been sorted)");
        System.out.println(Arrays.binarySearch(arr1, 48)); // returns the index of 48

        // COMBINE 2 ARRAYS IN 1 AND SORT THE NEW ARRAY
        int[] sortedCombined = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int ind = arr1.length;
        for (int i : arr2) {
            sortedCombined[ind++] = i;
        }
        Arrays.sort(sortedCombined);
        System.out.println(Arrays.toString(sortedCombined));

        // Reverse 1D array
        System.out.println(Arrays.toString(arr1));
        for (int i = 0 ; i < arr1.length / 2 ; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr1));

        // sort(Object[] a, int fromIndex(inclusive), int toIndex(exclusive))
        // Sorts the specified range of the specified array of objects into ascending order, 
        // according to the natural ordering of its elements.
        Arrays.sort(arr1, 5, 9);
        System.out.println(Arrays.toString(arr1));

        // Check if two int arrays have the same number of elements AND same elements at the same index
        System.out.println(Arrays.equals(new int[]{ 3, 2, 1 }, new int[]{ 1, 2, 3 })); // false
        System.out.println(Arrays.equals(new int[]{ 1, 2, 3 }, new int[]{ 1, 2, 3 })); // true

    }

    /* TWO-DIMENSIONAL ARRAYS */
    // Flip the array (Lab Test Q1f)
    public static int[][] flip(int[][] numbers) {
        int numRows = numbers[0].length; // for the returned array
        int numCols = numbers.length;
        
        int[][] ret = new int[numRows][numCols];
        for (int i = 0 ; i < numRows ; i++) { // for each row
            for (int j = 0 ; j < numCols ; j++) {
                ret[i][j] = numbers[j][i];
            }
        }
        return ret;
    }
}