public class Matkomlan extends MataKuliah {
    public Matkomlan(){
        super("Matkomlan");
    }

    @Override
    public double hitungNilaiAkhir(){
        nilaiAkhir = (nilaiUTS * 0.25) + (nilaiUAS * 0.25) + (nilaiTugas * 0.3) + (nilaiKuis * 0.2);
        return nilaiAkhir;
    }
    
}
