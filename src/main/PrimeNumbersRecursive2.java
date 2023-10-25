package main;

public class PrimeNumbersRecursive2 {

	static int amountOfPrimes = 0;
    public void showPrimes(int start, int stop) {
        if (start > stop) {
            return;
        }

        if (isPrime(start)) {
        	amountOfPrimes++;
            System.out.println(start);
        }

        showPrimes(start + 1, stop);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumbersRecursive2 prm2 = new PrimeNumbersRecursive2();

        prm2.showPrimes(2, 1000);
        System.out.println(amountOfPrimes);
    }
}
