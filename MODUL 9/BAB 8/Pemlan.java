public class Pemlan extends MataKuliah{
    public Pemlan(){
        super("Pemlan");
    }

    @Override
    public double hitungNilaiAkhir(){
        nilaiAkhir = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTugas * 0.2) + (nilaiKuis * 0.1);
        return nilaiAkhir;
    }

    
}
