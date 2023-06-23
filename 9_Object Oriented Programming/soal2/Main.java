class Main {
    public static void main(String[] args) {
        calculateVolume();
    }

    public static void calculateVolume() {
        // Volume Kubus
        int sisiKubus = 10;
        int volumeKubus = sisiKubus * sisiKubus * sisiKubus;
        System.out.println("Volume Kubus: " + volumeKubus);

        // Volume Balok
        int panjangBalok = 3;
        int lebarBalok = 6;
        int tinggiBalok = 10;
        int volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
        System.out.println("Volume Balok: " + volumeBalok);

        // Volume Tabung
        int jariJariTabung = 7;
        int tinggiTabung = 10;
        double volumeTabung = Math.PI * jariJariTabung * jariJariTabung * tinggiTabung;
        System.out.println("Volume Tabung: " + volumeTabung);
    }
}
