public class Mainan {
    private int totalMainan;
    private int jumlahAdik;
    private int mainanPeradik;
    private int sisaMainan;

    Mainan(int totalMainan, int jumlahAdik){
        this.totalMainan = totalMainan;
        this.jumlahAdik = jumlahAdik;
    }

    public void MainanPeradik(){
        mainanPeradik = totalMainan / jumlahAdik;
        System.out.println("Jumlah mainan yang dibeli untuk setiap adik Aji masing-masing sebesar " + mainanPeradik);
        System.out.println("Sehingga total mainan yang dibeli yakni " + 3 * mainanPeradik);
    }

    public void SisaMainan(){
        sisaMainan = totalMainan % jumlahAdik;
    }

    public void Keterangan(){
        if (sisaMainan == 0){
            System.out.println("\nPembagian mainan adil.");
        } else {
            System.out.println("\nPembagian mainan tidak adil. Sisa mainan berjumlah " + sisaMainan + ". Jadi, sisanya untuk Aji saja ;)");
        }
    }





}
