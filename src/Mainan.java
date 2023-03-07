// Pada kelas Mainan ini mempunyai 4 atribut
public class Mainan {
    private int totalMainan;
    private int jumlahAdik;
    private int mainanPeradik;
    private int sisaMainan;

    // Di bawah ini adalah constructor yang memasukkan total mainan yang akan dibeli dan jumlah adik
    Mainan(int totalMainan, int jumlahAdik){
        this.totalMainan = totalMainan;
        this.jumlahAdik = jumlahAdik;
    }

    // method ini digunakan untuk menentukan berapa jumlah mainan yang akan didapatkan oleh masing-masing adik Aji
    public void MainanPeradik(){
        mainanPeradik = totalMainan / jumlahAdik;
        System.out.println("Jumlah mainan yang dibeli untuk setiap adik Aji masing-masing sebesar " + mainanPeradik);
        System.out.println("Sehingga total mainan yang dibeli yakni " + 3 * mainanPeradik);
    }

    // Method ini digunakan untuk mencari sisa dari pembagian total mainan dan mainan yang akan adik Aji dapatkan
    public void SisaMainan(){
        sisaMainan = totalMainan % jumlahAdik;
        System.out.println("Sisa mainan : " + sisaMainan);
    }

    // Jika pembagian total mainan dan mainan yang masing-masing akan didapatkan oleh adik Aji bersisa, maka program  akan mencetak "pembagian tidak adil" dan begitu sebaliknya
    public void Keterangan(){
        if (sisaMainan == 0){
            System.out.println("\nPembagian mainan adil.");
        } else {
            System.out.println("\nPembagian mainan tidak adil. Sisa mainan berjumlah " + sisaMainan + ". Jadi, sisanya untuk Aji saja ;)");
        }
    }





}
