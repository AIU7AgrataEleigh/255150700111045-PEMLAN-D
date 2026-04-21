package latihanInterface;

public class Hewan implements MakhlukHidup, Identitas{
    private String nama;
    private int umur;

    Hewan (String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void bernapas() {
        System.out.println("Nafas pakai paru-paru");
    }

    @Override
    public void tidur() {
        System.out.println("Tidur pakai paha");
    }


    @Override
    public void tampilkanNama() {
        System.out.println("Nama: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur:" + this.umur);
    }
}
