class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the isPrime method
        int[] numbers = {2, 3, 4, 5, 16, 17, 18};
        for (int number : numbers) {
            System.out.println("Is " + number + " a prime number? " + isPrime(number));
        }
    }
}
