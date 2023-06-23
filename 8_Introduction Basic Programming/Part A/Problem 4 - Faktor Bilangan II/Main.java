public class Main {
    public static void main(String[] args) {
        // Input
        int bilangan = 6;

        // Cetak faktor
        printFactors(bilangan);
    }

    public static void printFactors(int number) {
        System.out.println("Faktor-faktor dari bilangan " + number + ":");
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
