import java.util.ArrayList;

// Pada kelas Belanja ini mempunyai 4 atribut
public class Belanja {
    private ArrayList<String> daftarBelanjaan;
    private ArrayList<String> barangDibeli;
    private int totalBelanja;
    private int uangDina;

    // Ini adalah constructor tentang uang yang digunakan dina yang membayar belanjaan
    Belanja(int uangDina){
        this.uangDina = uangDina;
    }

    // Method dibawah ini akan memasukkan barang dari main ke dalam list
    public void DaftarBelanja(String barang) {
        if (daftarBelanjaan == null) {
            daftarBelanjaan = new ArrayList<>();
        }
        daftarBelanjaan.add(barang);
    }
    // Daftar belanja "cabai" yang telah ditetapkan di awal akan diganti menjadi "ayam" dan "minyak"
    public void DaftarYangDibeli() {
        barangDibeli = new ArrayList<>();
        for (String barang : daftarBelanjaan) {
            if (barang.equals("cabai")) {
                barangDibeli.add("ayam");
                barangDibeli.add("minyak");
            } else {
                barangDibeli.add(barang);
            }
        }
    }

    // Method dibawah ini digunakan untuk menghitung total harga barang yang akan dibeli
    public void hitungTotalBelanja() {
        totalBelanja = 0;
        int hargaCabai = 3000;
        int hargaBawang = 3000;
        int hargaBayam = 2000;
        int hargaBeras = 20000;
        int hargaAyam = 20000;
        int hargaTempe = 5000;
        int hargaMinyak = 12000;

        for (String barang : barangDibeli) {
            switch (barang) {
                case "cabai":
                    totalBelanja += hargaCabai;
                    break;
                case "bawang":
                    totalBelanja += hargaBawang;
                    break;
                case "bayam":
                    totalBelanja += hargaBayam;
                    break;
                case "beras":
                    totalBelanja += hargaBeras;
                    break;
                case "ayam":
                    totalBelanja += hargaAyam;
                    break;
                case "tempe":
                    totalBelanja += hargaTempe;
                    break;
                case "minyak":
                    totalBelanja += hargaMinyak;
                    break;
            }
        }
    }

    // Mehtod di bawah ini digunakan untuk menampilkan daftar belanja awal
    public void tampilkanDaftarBelanjaan() {
        System.out.println("Daftar Belanjaan:");
        for (String barang : daftarBelanjaan) {
            System.out.println("- " + barang);
        }
    }

    // Mehtod di bawah ini digunakan untuk menampilkan daftar yang akan dibeli
    public void tampilkanBarangDibeli() {
        System.out.println("\nBarang yang dibeli:");
        for (String barang : barangDibeli) {
            System.out.println("- " + barang);
        }
    }

    // Mehtod di bawah ini digunakan untuk menampilkan total harga yang keterangan apakah uang Dina cukup atau tidak
    public void tampilkanTotalBelanja() {
        hitungTotalBelanja();
        System.out.println("\nTotal belanja: Rp " + totalBelanja);
        if (totalBelanja < uangDina) {
            System.out.println("\nUang yang dibawa cukup.");
        } else if (totalBelanja == uangDina) {
            System.out.println("\nUang yang dibawa pas.");
        } else {
            System.out.println("\nUang yang dibawa kurang.");
        }
    }

}
