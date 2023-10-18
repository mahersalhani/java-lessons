public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return original == reverse;
    }
}
