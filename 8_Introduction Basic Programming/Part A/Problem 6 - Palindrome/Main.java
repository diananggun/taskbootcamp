public class Main {
    private static boolean palindrome(String value) {
        int left = 0;
        int right = value.length() - 1;

        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));       // true
        System.out.println(palindrome("katak"));       // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu"));   // false
        System.out.println(palindrome("lion"));        // false
    }
}
