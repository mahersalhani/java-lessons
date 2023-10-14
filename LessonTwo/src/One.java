public class One {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;

        System.out.println("This is a test");

        System.out.println("This is " +
                "another " +
                "still more.");

        int anotherVariable = 50;
        myVariable--;

        System.out.println("This is another one");

        int myTotal = myVariable + anotherVariable;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        calculateScore(true, 800, 5, 100);
    }

    public  static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
}
















