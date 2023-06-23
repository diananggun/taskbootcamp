class BangunDatar {
    int sisi;
    int alas;
    int tinggi;
    int panjang;
    int lebar;
    
    // Method untuk menghitung luas persegi
    int hitungLuasPersegi() {
        return sisi * sisi;
    }
    
    // Method untuk menghitung keliling persegi
    int hitungKelilingPersegi() {
        return 4 * sisi;
    }
    
    // Method untuk menghitung luas segitiga
    double hitungLuasSegitiga() {
        return 0.5 * alas * tinggi;
    }
    
    // Method untuk menghitung keliling segitiga
    int hitungKelilingSegitiga() {
        return alas + tinggi + (int) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
    
    // Method untuk menghitung luas persegi panjang
    int hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }
    
    // Method untuk menghitung keliling persegi panjang
    int hitungKelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }
}

class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        
        // Menghitung luas
        bangunDatar.sisi = 4;
        int luasPersegi = bangunDatar.hitungLuasPersegi();
        System.out.println("Luas Persegi: " + luasPersegi);
        
        bangunDatar.alas = 3;
        bangunDatar.tinggi = 4;
        double luasSegitiga = bangunDatar.hitungLuasSegitiga();
        System.out.println("Luas Segitiga: " + luasSegitiga);
        
        bangunDatar.panjang = 7;
        bangunDatar.lebar = 8;
        int luasPersegiPanjang = bangunDatar.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        
        // Menghitung keliling
        int kelilingPersegi = bangunDatar.hitungKelilingPersegi();
        System.out.println("Keliling Persegi: " + kelilingPersegi);
        
        int kelilingSegitiga = bangunDatar.hitungKelilingSegitiga();
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);
        
        int kelilingPersegiPanjang = bangunDatar.hitungKelilingPersegiPanjang();
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
