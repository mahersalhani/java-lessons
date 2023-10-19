import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            getInputFromConsole(currentYear);
        } catch (NullPointerException e) {
            System.out.println(getAgeFromConsole(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hello " + name + "!");

        return "";
    }

    public static String getAgeFromConsole(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What year were you born? ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("You are " + age + " years old.");

        return "";
    }
}
