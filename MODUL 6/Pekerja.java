import java.time.LocalDate;
import  java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    // private String departemen;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak){
        super(nama,jenisKelamin, nik, menikah);

        this.gaji=gaji;
        this.tahunMasuk= LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak=jumlahAnak; 
    }

    // public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah) {
    //     //TODO Auto-generated constructor stub
    //     super(nama,jenisKelamin, nik, menikah);
        // this.departemen = departemen;

    //}

    public double getGajiPokok() { // Penting untuk Manager
        return this.gaji;
    }

    public void setGaji(double gaji){
        this.gaji=gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk=tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak=jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }

    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }

    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){

        LocalDate hariIni = LocalDate.now();
        long lamaBekerja = ChronoUnit.YEARS.between(this.tahunMasuk, LocalDate.now());
        double persenBonus = 0;

        if (lamaBekerja >= 0 && lamaBekerja <= 5){
            persenBonus =0.05;
        } 
        else if(lamaBekerja > 5 && lamaBekerja <= 10){
            persenBonus = 0.10;
        }
        else{
            persenBonus = 0.15;
        }

        return persenBonus*gaji;

    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.gaji; 
    }

    @Override
    public double getTunjangan(){
        double tunjanganAnak = jumlahAnak*20;

        return this.gaji + getBonus() + tunjanganAnak;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "\nGaji Pokok    : $%.1f\n" +
                "Tahun Masuk   : %d %d %d\n" +
                "Jumlah Anak   : %d\n" +
                "Bonus         : $%.1f\n" +
                "Total Gaji    : $%.1f",
                this.gaji, 
                tahunMasuk.getDayOfMonth(),   // Ambil tanggal
                tahunMasuk.getMonthValue(),    // Ambil angka bulan
                tahunMasuk.getYear(),
                this.jumlahAnak, 
                getBonus(), 
                getTunjangan()
            );
    }
    
}
