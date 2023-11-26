import java.util.Arrays;
import java.util.Random;

public class Main2 {
    private int test1 = 1;
    public int test2 = 2;

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println("firstArray: " + Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("firstArray: " + Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println("thirdArray: " + Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("fourthArray: " + Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println("fourthArray: " + Arrays.toString(fourthArray));

        String [] sArray = {"Able", "Jane", "Mark", "Tom"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Mark is in the array");
        }

    }

    private static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
