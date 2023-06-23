class Main {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 2;
        int tinggi = 4;
        int berat = 1;

        int volume = panjang * lebar * tinggi;
        int harga = calculateHarga(volume, berat);
        System.out.println("Harga: Rp " + harga);
    }

    public static int calculateHarga(int volume, int berat) {
        if (volume < 50 || berat < 1) {
            return 5000;
        }

        int hargaPerKg = 5000;
        int beratPembulatan = (int) Math.ceil(berat);
        int totalHarga = Math.max(volume, 50) * beratPembulatan * hargaPerKg;

        return totalHarga;
    }
}
