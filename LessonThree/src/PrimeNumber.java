public class PrimeNumber {

    public  static  void main(String[] args) {
        printPrimeNumber(1000);
    }


    public  static  void printPrimeNumber(int number) {
        int i = 2;
        while (i < number) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }


    public  static  boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
