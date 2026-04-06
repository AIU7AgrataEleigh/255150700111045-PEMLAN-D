public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji,int tahun, int bulan, int tanggal, int jumlahAnak, String departemen){
        super(nama,jenisKelamin, nik, menikah, gaji, tahun, bulan, tanggal, jumlahAnak);

        this.departemen=departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen=departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    @Override
    public double getTunjangan() {
        // Pendapatan Pekerja + 10% dari Gaji Pokok
        return super.getTunjangan() + (0.10 * getGajiPokok());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "Departemen : %s", this.departemen
            );
    }

}
