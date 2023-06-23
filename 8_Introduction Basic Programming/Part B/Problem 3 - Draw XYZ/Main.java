public class Main {
    private static void drawXYZ(int n) {
        char[] symbols = {'X', 'Y', 'Z'};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(symbols[(j + i + 1) % 3] + " ");
                } else {
                    System.out.print(symbols[(j + 1) % 3] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(3);
        System.out.println();
        drawXYZ(5);
        System.out.println();
        drawXYZ(1);
    }
}
