public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk){
        super(nama,jenisKelamin, nik, menikah);

        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNIM (String nim){
        this.nim=nim;
    }

    public void setIPK (double ipk){
        this.ipk=ipk;
    }

    public String getNIM(){
        return nim;
    }

    public double getIPK(){
        return ipk;
    }

    public String getStatus(){
        String angkatan = nim.substring(0,2);

        char kodeProdi = nim.charAt(6);
        String namaProdi;

        switch (kodeProdi){
            case '2':
                namaProdi = "Teknik Informatika";
                break;
            case '3':
                namaProdi = "Teknik Komputer";
                break;
            case '4':
                namaProdi = "Sistem Informasi";
                break;
            case '6':
                namaProdi ="Pendidikan Teknologi Informasi";
                break;
            case '7':
                namaProdi = "Teknologi Informasi";
                break;
            default:
                namaProdi = "Prodi Tidak Diketahui";
                break;
        }

        return namaProdi + ", 20" + angkatan;

    }

    public double getBeasiswa(){
        if(ipk>= 3.0 && ipk <= 3.5){
            return 50;
        }
        else if(ipk>=3.5 && ipk <= 4.0){
            return 75;
        }
        else{
            return 0;
        }

    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "NIM           : %s\n" +
                "IPK           : %.2f\n" +
                "Status        : %s\n" +
                "Beasiswa      : $%.1f",
                nim, ipk, getStatus(),getBeasiswa()
            );
    }
}