public class MainProgram {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        daftarKue [0] = new KuePesanan("Brownies", 50000, 1.5);
        daftarKue [1] = new KueJadi("Donat", 2000, 10);
        daftarKue [2] = new KuePesanan("Lapis", 40000, 2);
        daftarKue [3] = new KueJadi("Kue Sus", 1500, 20);

        for (int i = 4; i < 20; i++) {
            if (i % 2 == 0) {
                daftarKue[i] = new KuePesanan("KuePesanan" + i, 30000, 1 + i);
            } else {
                daftarKue[i] = new KueJadi("KueJadi" + i, 1000, i);
            }
        }

        double totalSemua = 0;

        double totalPesanan = 0;
        double totalBerat = 0;

        double totalJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = daftarKue[0];

        for (Kue k : daftarKue) {

            System.out.println(k);
            double hargaAkhir = k.hitungHarga();
            System.out.println("Harga Akhir: " + hargaAkhir);
            System.out.println();

            totalSemua += hargaAkhir;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalPesanan += hargaAkhir;
                totalBerat += kp.getBerat();
            }

            if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalJadi += hargaAkhir;
                totalJumlah += kj.getJumlah();
            }

            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("=== HASIL ===");
        System.out.println("Total semua harga: " + totalSemua);

        System.out.println("\nTotal KuePesanan: " + totalPesanan);
        System.out.println("Total berat: " + totalBerat + " g");

        System.out.println("\nTotal KueJadi: " + totalJadi);
        System.out.println("Total jumlah: " + totalJumlah);

        System.out.println("\nKue Termahal:");
        System.out.println(kueTermahal);
        System.out.println("Harga: " + kueTermahal.hitungHarga());
    }
}