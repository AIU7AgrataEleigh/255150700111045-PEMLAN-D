public class Probstat extends MataKuliah {
    public Probstat(){
        super("Probstat");
    }
    
    @Override
    public double hitungNilaiAkhir(){
        nilaiAkhir = (nilaiUTS * 0.2) + (nilaiUAS * 0.3) + (nilaiTugas * 0.3) + (nilaiKuis * 0.2);
        return nilaiAkhir;
    }
    
}
