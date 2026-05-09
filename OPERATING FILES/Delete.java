import java.io.File;
public class Delete {
    public static void main(String[] args) {
        // var file = new File("test-baru.txt");
        var folder = new File("data");
        // if (file.exists()) {
        //     var result = file.delete();
        //     System.out.println((result ? "Berhasil" : "Gagal")
        //     + " menghapus file");
        // } else {
        //     System.out.println("File tidak ada");
        // }
        if (folder.exists() && folder.isDirectory()) {
            // 1. Ambil semua file yang ada di dalam folder tersebut
            File[] isiFolder = folder.listFiles(); // Menggunakan listFiles() sesuai petunjuk [cite: 406]

            if (isiFolder != null) {
                // 2. Hapus satu per satu filenya terlebih dahulu
                for (File f : isiFolder) {
                    f.delete(); // Menghapus file individual 
                    System.out.println("Menghapus file: " + f.getName());
                }
            }

            // 3. Setelah kosong, baru hapus folder utamanya
            var result = folder.delete(); 
            System.out.println((result ? "Berhasil" : "Gagal") + " menghapus direktori");
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan folder.");
        }


    }
}