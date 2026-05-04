public class ASD extends MataKuliah {
   public ASD(){
        super("ASD");
   }

   @Override
   public double hitungNilaiAkhir(){
        nilaiAkhir = (nilaiUTS * 0.2) + (nilaiUAS * 0.3) + (nilaiTugas * 0.3) + (nilaiKuis * 0.2);
        return nilaiAkhir;
   }


    
}
