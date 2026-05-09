import java.io.File;

public class TampilNama{
    public static void main(String[] args) {
        // 1. Tentukan direktori yang ingin dicek
        // Titik "." merujuk pada direktori proyek saat ini
        File folder = new File(".");

        // 2. Gunakan method list() untuk mendapatkan array String 
        String[] daftarNama = folder.list();

        // 3. Cek apakah folder tersebut ada dan bisa diakses [cite: 28, 35]
        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Isi direktori: " + folder.getAbsolutePath());
            
            // 4. Lakukan perulangan untuk menampilkan nama-nama tersebut
            if (daftarNama != null) {
                for (String nama : daftarNama) {
                    System.out.println("- " + nama);
                }
            } else {
                System.out.println("Direktori kosong atau terjadi error.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan!");
        }
    }
}