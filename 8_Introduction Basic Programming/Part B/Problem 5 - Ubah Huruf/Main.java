public class Main {
    private static String ubahHuruf(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c + 10);
                if (shiftedChar > 'Z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA")); // SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG")); // QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER")); // ZBYOBKWWOB
    }
}
