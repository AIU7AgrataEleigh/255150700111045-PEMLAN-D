public abstract class Kue {

    public String nama; 
    public double harga; 

    public Kue(String nama, double harga){
        this.nama = nama; 
        this.harga = harga; 
    }

    public abstract double hitungHarga();

    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;

    }

}
