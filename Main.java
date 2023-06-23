// public class Main {
//     public static void main(String[] args) {
//         float alas = 20;
//         float tinggi = 25;
        
//         float luas = 0.5f * alas * tinggi;
        
//         System.out.println("Luas segitiga: " + luas);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Input
//         int studentScore = 80;

//         // Process: Konversi angka ke huruf
//         String studentGrade = convertToGrade(studentScore);

//         // Output
//         System.out.println("Nilai: " + studentGrade);
//     }

//     public static String convertToGrade(int score) {
//         if (score < 0 || score > 100) {
//             return "Invalid";
//         } else if (score >= 80) {
//             return "A";
//         } else if (score >= 65) {
//             return "B+";
//         } else if (score >= 50) {
//             return "B";
//         } else if (score >= 35) {
//             return "C";
//         } else {
//             return "D";
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         // Input
//         int bilangan = 6;

//         // Cetak faktor
//         printFactors(bilangan);
//     }

//     public static void printFactors(int number) {
//         System.out.println("Faktor-faktor dari bilangan " + number + ":");
//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Input
//         int bilangan = 6;

//         // Cetak faktor
//         printFactors(bilangan);
//     }

//     public static void printFactors(int number) {
//         System.out.println("Faktor-faktor dari bilangan " + number + ":");
//         for (int i = number; i >= 1; i--) {
//             if (number % i == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Main {
//     private static boolean primeNumber(int number) {
//         if (number <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(primeNumber(7));  // true
//         System.out.println(primeNumber(10)); // false
//         System.out.println(primeNumber(11)); // true
//         System.out.println(primeNumber(13)); // true
//         System.out.println(primeNumber(17)); // true
//         System.out.println(primeNumber(20)); // false
//         System.out.println(primeNumber(35)); // false
//     }
// }

// public class Main {
//     private static boolean palindrome(String value) {
//         int left = 0;
//         int right = value.length() - 1;

//         while (left < right) {
//             if (value.charAt(left) != value.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(palindrome("civic"));       // true
//         System.out.println(palindrome("katak"));       // true
//         System.out.println(palindrome("kasur rusak")); // true
//         System.out.println(palindrome("kupu-kupu"));   // false
//         System.out.println(palindrome("lion"));        // false
//     }
// }


// public class Main {
//     private static int pangkat(int x, int n) {
//         int result = 1;

//         for (int i = 0; i < n; i++) {
//             result *= x;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         System.out.println(pangkat(2, 3));  // 8
//         System.out.println(pangkat(5, 3));  // 125
//         System.out.println(pangkat(10, 2)); // 100
//         System.out.println(pangkat(2, 5));  // 32
//         System.out.println(pangkat(7, 3));  // 343
//     }
// }

// public class Main {
//     private static void printTriangle(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = n - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         printTriangle(5);
//     }
// }

// public class Main {
//     private static void drawXYZ(int n) {
//         char[] symbols = {'X', 'Y', 'Z'};

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i % 2 == 0) {
//                     System.out.print(symbols[(j + i + 1) % 3] + " ");
//                 } else {
//                     System.out.print(symbols[(j + 1) % 3] + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         drawXYZ(3);
//         System.out.println();
//         drawXYZ(5);
//         System.out.println();
//         drawXYZ(1);
//     }
// }

// public class Main {
//     private static void cetakTablePerkalian(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(i * j + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         cetakTablePerkalian(9);
//     }
// }

// public class Main {
//     private static String ubahHuruf(String s) {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (Character.isLetter(c)) {
//                 char shiftedChar = (char) (c + 10);
//                 if (shiftedChar > 'Z') {
//                     shiftedChar = (char) (shiftedChar - 26);
//                 }
//                 result.append(shiftedChar);
//             } else {
//                 result.append(c);
//             }
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         System.out.println(ubahHuruf("SEPULSA OKE")); // COZEVCK YUO
//         System.out.println(ubahHuruf("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
//         System.out.println(ubahHuruf("INDONESIA")); // SXNYXOCSK
//         System.out.println(ubahHuruf("GOLANG")); // QYVKXQ
//         System.out.println(ubahHuruf("PROGRAMMER")); // ZBYOBKWWOB
//     }
// }


// import java.util.Arrays;

// public class Main {
//     private static float Mean(float[] numbers) {
//         float sum = 0;
//         for (float number : numbers) {
//             sum += number;
//         }
//         return Math.round((sum / numbers.length) * 10) / 10f;
//     }

//     public static void main(String[] args) {
//         float[] values = {1, 2, 3, 4};
//         System.out.println(Mean(values)); // 2.5
//     }
// }

