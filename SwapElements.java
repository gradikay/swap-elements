/**
 * This Generic Java program swaps two elements.
 * @author Gradi Kayamba
 * @version 6/7/24
 */
package secondProject;
public class SwapElements {

    /**
     * This generic method swaps two elements in the given array
     * @param array the array of elements
     * @param firstE the index of the first element to swap
     * @param secondE the index of the second element to swap
     */
    public static <T> void swapElements(T[] array, int firstE, int secondE) {
    	int size = array.length;
    	if(firstE > size - 1 || secondE > size - 1 || firstE < 0 || secondE < 0) return; // integer out of bound
        T temp = array[firstE];
        array[firstE] = array[secondE];
        array[secondE] = temp;
    }

    /**
     * This generic method prints the elements of an array
     * @param array the array of elements to print
     */
    public static <T> void printIntArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 12, 5, 3, 90 };
        String[] strArray = { "I", "You", "He", "She" };

        // Display the arrays before swapping elements
        System.out.println("Not Swapped Elements:");
        printIntArray(intArray);
        printIntArray(strArray);
        System.out.println();

        // Swap elements in the arrays
        swapElements(intArray, 2, 3);
        swapElements(strArray, 2, 0);

        // Display the arrays after swapping elements
        System.out.println("Swapped Elements:");
        printIntArray(intArray);
        printIntArray(strArray);
        System.out.println();
    }
}
