import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myArray[5]);
        System.out.println(myDoubleArray[2]);

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first element: " + myIntArray[0]);
        int length = myIntArray.length;
        System.out.println("length: " + length);

        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Element " + i + ", value is " + newArray[i]);
        }


        for (int element : newArray) {
            System.out.println("Element: " + element);
        }

        System.out.println((Arrays.toString(newArray)));
    }
}
