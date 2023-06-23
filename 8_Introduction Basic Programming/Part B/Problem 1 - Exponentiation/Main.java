public class Main {
    private static int pangkat(int x, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));  // 8
        System.out.println(pangkat(5, 3));  // 125
        System.out.println(pangkat(10, 2)); // 100
        System.out.println(pangkat(2, 5));  // 32
        System.out.println(pangkat(7, 3));  // 343
    }
}
