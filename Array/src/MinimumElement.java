import java.util.Scanner;

public class MinimumElement {


    private static int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
