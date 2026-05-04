public abstract class MataKuliah{
    protected String nama;
    protected int nilaiUTS; 
    protected int nilaiUAS;
    protected int nilaiTugas;
    protected int nilaiKuis;
    protected double nilaiAkhir;

    public MataKuliah(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNilai(int nilaiUTS, int nilaiUAS, int nilaiTugas, int nilaiKuis){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
    }

    public abstract double hitungNilaiAkhir();

    public String getGrade(){
        if(nilaiAkhir >= 80 && nilaiAkhir <= 100){
            return "A";
        }else if(nilaiAkhir >= 70 && nilaiAkhir < 80){
            return "B";
        }else if(nilaiAkhir >= 60 && nilaiAkhir < 70){
            return "C";
        }else if(nilaiAkhir >= 50 && nilaiAkhir < 60){
            return "D";
        }else{
            return "E";
        }
    }

}