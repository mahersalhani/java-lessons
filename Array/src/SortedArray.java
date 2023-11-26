import java.util.Scanner;

public class SortedArray {

    public static void getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; ++i) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
