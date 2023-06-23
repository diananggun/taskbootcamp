public class Main {
    public static void main(String[] args) {
        // Input
        int studentScore = 80;

        // Process: Konversi angka ke huruf
        String studentGrade = convertToGrade(studentScore);

        // Output
        System.out.println("Nilai: " + studentGrade);
    }

    public static String convertToGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        } else if (score >= 80) {
            return "A";
        } else if (score >= 65) {
            return "B+";
        } else if (score >= 50) {
            return "B";
        } else if (score >= 35) {
            return "C";
        } else {
            return "D";
        }
    }
}


