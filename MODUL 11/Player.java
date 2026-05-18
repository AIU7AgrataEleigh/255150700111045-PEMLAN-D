public class Player {
    int tinggi;
    int berat;

    public Player(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString() {
        return tinggi + " cm - " + berat + " kg";
    }
}