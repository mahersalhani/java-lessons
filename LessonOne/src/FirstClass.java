public class FirstClass {
    public static void main(String[] args) {
        boolean isAlien = true;

        if (!isAlien)
            System.out.println("It is not an alien!");
         else if (isAlien)
            System.out.println("It is an alien!");
        else
            System.out.println("I don't know what it is!");


        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double result = firstValue + secondValue * 100.00d;

        System.out.println("Result = " + result);

        double remainder = result % 40.00d;

        System.out.println("Remainder = " + remainder);

        boolean isNoRemainder = remainder == 0;

        System.out.println("isNoRemainder = " + isNoRemainder);
    }
}
