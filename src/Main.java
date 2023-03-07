public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 1");
        System.out.println("");

        Belanja belanja = new Belanja(50000);
        belanja.DaftarBelanja("cabai");
        belanja.DaftarBelanja("bayam");
        belanja.DaftarBelanja("bawang");
        belanja.DaftarBelanja("tempe");
        belanja.DaftarBelanja("beras");

        belanja.DaftarYangDibeli();
        belanja.tampilkanDaftarBelanjaan();
        belanja.tampilkanBarangDibeli();

        belanja.hitungTotalBelanja();
        belanja.tampilkanTotalBelanja();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\nAssignment 2");
        System.out.println("");

        Mainan mainan = new Mainan(13, 3);
        mainan.MainanPeradik();
        mainan.SisaMainan();
        mainan.Keterangan();

    }
}
