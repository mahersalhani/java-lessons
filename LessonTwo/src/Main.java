public class Main {
    public static void main(String[] args) {
        System.out.println("5 feet 8 inches = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68 inches = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        int totalInches = feet * 12 + inches;

        return totalInches * 2.54;
    }

    public static double convertToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }

        int feet = inches / 12;
        int remainingInches = inches % 12;

        return convertToCentimeters(feet, remainingInches);
    }
}
