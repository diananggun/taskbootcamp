public class Main {
    private static boolean primeNumber(int number) {
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
        System.out.println(primeNumber(7));  // true
        System.out.println(primeNumber(10)); // false
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false
    }
}
